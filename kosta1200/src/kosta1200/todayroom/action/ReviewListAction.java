package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ReviewService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ReviewVO;
import kosta1200.todayroom.vo.Review_PagingVO;

public class ReviewListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ReviewService service = ReviewService.getInstance();
		
		Review_PagingVO list = service.listReviewService(request);
		
		System.out.println("list를 보여줘라 : "+ list);
		request.setAttribute("list", list);
		
		
		
		forward.setRedirect(false);
		forward.setPath("/main_views/review/review.jsp");
		return forward;
	}

}
