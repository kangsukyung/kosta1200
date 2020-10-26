package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ReviewService;
import kosta1200.todayroom.vo.ReviewVO;

public class ReviewDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ReviewService service = ReviewService.getInstance();
		
		ReviewVO reviewvo = new ReviewVO();
		reviewvo.setReview_seq(Integer.parseInt(request.getParameter("review_seq")));
		service.DeleteReviewService(reviewvo);
		
		forward.setRedirect(true);
		forward.setPath("ReviewListAction.do");
		
		return forward;
	}

}
