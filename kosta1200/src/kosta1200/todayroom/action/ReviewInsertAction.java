package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ReviewService;

public class ReviewInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		ReviewService service = ReviewService.getInstance();
		
		service.ReviewInsertService(request);
		
		forward.setRedirect(true);
		forward.setPath("ReviewListAction.do");
		
		return forward;
	}

}
