package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.ReviewDAO;
import kosta1200.todayroom.vo.CommentsVO;
import kosta1200.todayroom.vo.Comments_PagingVO;
import kosta1200.todayroom.vo.ImageUtil;
import kosta1200.todayroom.vo.ReviewVO;
import kosta1200.todayroom.vo.Review_PagingVO;

public class ReviewService {
	private static ReviewService service = new ReviewService();
	private static ReviewDAO dao;
	private static final int PAGE_SIZE = 3;
	
	public static ReviewService getInstance(){
		dao = ReviewDAO.getInstance();
		return service;
		
	}
	
	//list
	public Review_PagingVO listReviewService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		//페이징 처리
				//페이지당 글 개수, 총 글 개수, 총 페이지 수, 현재페이지

				//총 글 개수
				int totalCount = dao.countReview();
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
				
				List<ReviewVO> list = dao.listReview(startRow);
				//페이징에 필요한 모든 정보를 가지고 있는 객체를 생성
				Review_PagingVO listReview = new Review_PagingVO(list, requestPage, totalPageCount, startPage, endPage, totalCount);
				
		return listReview;
	}
	
	//insert
	public int ReviewInsertService(HttpServletRequest request)throws Exception{
		
		//파일 업로드(경로, 파일크기, 인코딩방식, 파일이름 중첩 시 정책)
		String uploadPath = request.getRealPath("upload");
		System.out.println(uploadPath);
		int size = 20 * 1024 * 1024;//20MB
		
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());//여기에서 파일 업로드가 이루어짐
		
		ReviewVO reviewvo = new ReviewVO();
		reviewvo.setReview_content(multi.getParameter("review_content"));
		reviewvo.setReview_rating(request.getParameter("review_rating"));
		reviewvo.setReview_date(request.getParameter("review_date"));
		reviewvo.setReview_picture("");
		
		//파일 업로드 DB(파일이름 저장)
		if(multi.getFilesystemName("review_picture") != null){
			String review_picture = (String)multi.getFilesystemName("review_picture");
			reviewvo.setReview_picture(review_picture);
		
			//썸네일 이미지(gif,jpg) => aa.gif , aa.jpg 일 때만
			String pattern = review_picture.substring(review_picture.indexOf(".")+1);//gif
			String head = review_picture.substring(0, review_picture.indexOf("."));//aa
			
			//원본 파일객체
			String imagePath = uploadPath + "\\" + review_picture;
			File src = new File(imagePath);//원본파일객체에 대한 내용
			
			//썸네일 파일객체
			String thumPath = uploadPath + "\\" + head + "_small." + pattern;
			File dest = new File(thumPath);
			
			if(pattern.equals("gif") || pattern.equals("jpg")||pattern.equals("png")){
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);//썸네일 이미지 생성됨
			}
			
		}
		return dao.insertReview(reviewvo);
	}
	
	//delete
	public int DeleteReviewService(ReviewVO reviewvo) throws Exception{
		return dao.DeleteReview(reviewvo);
	}
	
	
	
}
