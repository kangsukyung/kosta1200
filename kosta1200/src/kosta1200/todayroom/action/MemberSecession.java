package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class MemberSecession implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
			
		int re=service.MemberSecession(request, response);
		
		request.getSession().invalidate();
		forward.setRedirect(true);
		forward.setPath("../main_views/member/member_login.jsp");
		return forward;
	}

}
