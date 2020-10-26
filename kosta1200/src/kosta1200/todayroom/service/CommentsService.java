package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.CommentsDAO;
import kosta1200.todayroom.vo.CommentsVO;
import kosta1200.todayroom.vo.Comments_PagingVO;
import kosta1200.todayroom.vo.ImageUtil;

public class CommentsService {
	private static CommentsService service = new CommentsService();
	private static CommentsDAO dao;
	private static final int PAGE_SIZE = 3;
	
	public static CommentsService getInstance(){
		dao = CommentsDAO.getInstance();
		return service;
	}
	
	//list
	public Comments_PagingVO listCommentsService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		//페이징 처리
				//페이지당 글 개수, 총 글 개수, 총 페이지 수, 현재페이지

				//총 글 개수
				int totalCount = dao.countComments();
				System.out.println("totalCount로 넘어온거 몇개  :  "+totalCount);
				//총 페이지의 수
				int totalPageCount = totalCount/PAGE_SIZE;
				
				if(totalPageCount%PAGE_SIZE > 0){	//마지막페이지에 글이 한개라도 있으면  페이지 수 하나 증가
					totalPageCount ++;
				}
				
				//현재 페이지
				String pageNum = request.getParameter("pageNum");
				if(pageNum == null){	//request값이 없으면, 현재번호가 안넘어오면 -> 삭제나 수정같은 경우
					pageNum = "1";
				}
				int requestPage = Integer.parseInt(pageNum);
				
				//시작페이지(start page)
				//startpPage의 공식 = 현재페이지 - (현재페이지 -1) % 5(한 구간의 보여줄 번호 개수)	
				int startPage = requestPage - (requestPage-1) % 5;
				int endPage = startPage + 4;
				if(totalPageCount < endPage){
					endPage = totalPageCount;
				}
				
				//startRow
				//startRow 의 공식 = (현재페이지 -1) * 페이지당 글 개수
				int startRow = (requestPage -1) * PAGE_SIZE;
				
				List<CommentsVO> list = dao.listComments(startRow);
				//페이징에 필요한 모든 정보를 가지고 있는 객체를 생성
				Comments_PagingVO listComments = new Comments_PagingVO(list, requestPage, totalPageCount, startPage, endPage, totalCount);
				
		return listComments;
	}
	
	//insert
	public int CommentsInsertService(HttpServletRequest request)throws Exception{
		
		//파일 업로드(경로, 파일크기, 인코딩방식, 파일이름 중첩 시 정책)
				String uploadPath = request.getRealPath("upload");
				System.out.println(uploadPath);
				int size = 20 * 1024 * 1024;//20MB
				
				MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());//여기에서 파일 업로드가 이루어짐
				
				CommentsVO commentsvo = new CommentsVO();
				commentsvo.setComments_content(multi.getParameter("comments_content"));
				commentsvo.setComments_picture("");
				
				//파일 업로드 DB(파일이름 저장)
				if(multi.getFilesystemName("comments_picture") != null){
					String comments_picture = (String)multi.getFilesystemName("comments_picture");
					commentsvo.setComments_picture(comments_picture);
				
					//썸네일 이미지(gif,jpg) => aa.gif , aa.jpg 일 때만
					String pattern = comments_picture.substring(comments_picture.indexOf(".")+1);//gif
					String head = comments_picture.substring(0, comments_picture.indexOf("."));//aa
					
					//원본 파일객체
					String imagePath = uploadPath + "\\" + comments_picture;
					File src = new File(imagePath);//원본파일객체에 대한 내용
					
					//썸네일 파일객체
					String thumPath = uploadPath + "\\" + head + "_small." + pattern;
					File dest = new File(thumPath);
					
					if(pattern.equals("gif") || pattern.equals("jpg")||pattern.equals("png")){
						ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);//썸네일 이미지 생성됨
					}
					
				}
		return dao.insertComments(commentsvo);
	}
	
	//update
	public int updateCommentsService(HttpServletRequest request,int comments_seq) throws Exception{
		System.out.println("SERVICE 에서 comments_seq :: "+comments_seq);
		
		String uploadPath = request.getRealPath("upload");
		System.out.println(uploadPath);
		int size = 20 * 1024 * 1024;
		
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		CommentsVO commentsvo = new CommentsVO();
		
		commentsvo.setComments_content(multi.getParameter("comments_content"));
		commentsvo.setComments_picture("");
		
		//나중에 메서드로 빼도 될듯
		if(multi.getFilesystemName("comments_picture") != null){
			String comments_picture = (String)multi.getFilesystemName("comments_picture");
			commentsvo.setComments_picture(comments_picture);
		
			//썸네일 이미지(gif,jpg) => aa.gif , aa.jpg 일 때만
			String pattern = comments_picture.substring(comments_picture.indexOf(".")+1);//gif
			String head = comments_picture.substring(0, comments_picture.indexOf("."));//aa
			
			//원본 파일객체
			String imagePath = uploadPath + "\\" + comments_picture;
			File src = new File(imagePath);//원본파일객체에 대한 내용
			
			//썸네일 파일객체
			String thumPath = uploadPath + "\\" + head + "_small." + pattern;
			File dest = new File(thumPath);
			
			if(pattern.equals("gif") || pattern.equals("jpg")||pattern.equals("png")){
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);//썸네일 이미지 생성됨
			}
			
		}
		return dao.updateComments(commentsvo);
	}
	
	

	//delete
	public int DeleteCommentsService(CommentsVO commentsvo) throws Exception{
		return dao.DeleteComments(commentsvo);
	}
}
