package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberUpdate_form implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
			
		forward.setRedirect(true);
		forward.setPath("../main_views/member/memberUpdate_form.jsp");
		
		return forward;
	}

}
