package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ScrapService;

public class ScrapInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ScrapService service = ScrapService.getInstance(); //서비스 객체 받아오기
		
		service.insertScrapService(request);
		
		forward.setRedirect(true);
		forward.setPath("ListAction.do");
		
		
		return forward;
	}

}
