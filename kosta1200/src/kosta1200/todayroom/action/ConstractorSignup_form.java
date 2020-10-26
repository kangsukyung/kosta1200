package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConstractorSignup_form implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("../main_views/member/constractor_signup.jsp");
		return forward;
	}

}
