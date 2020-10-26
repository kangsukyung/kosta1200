package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MemberLogout implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8"); 
		request.getSession().invalidate();
		
		response.getWriter().print("<script>alert('로그아웃 하셨습니다'); location.href='MemberLogin_Action.do'</script>");

		return null;

	}

}
