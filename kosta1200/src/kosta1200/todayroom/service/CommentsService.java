package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.CommentsDAO;
import kosta1200.todayroom.vo.CommentsVO;
import kosta1200.todayroom.vo.ImageUtil;

public class CommentsService {
	private static CommentsService service = new CommentsService();
	private static CommentsDAO dao;
	
	public static CommentsService getInstance(){
		dao = CommentsDAO.getInstance();
		return service;
	}
	
	public List<CommentsVO> listCommentsService()throws Exception{
		return dao.listComments();
	}
	
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
}
