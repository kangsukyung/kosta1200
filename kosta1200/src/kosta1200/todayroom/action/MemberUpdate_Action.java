package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class MemberUpdate_Action implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		
		int re=service.MemberUpdate(HttpServletRequest request, HttpServletResponse response);
		
		forward.setRedirect(true);
		forward.setPath("");
		return forward;
	}

}
