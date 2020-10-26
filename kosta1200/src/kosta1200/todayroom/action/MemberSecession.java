package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class MemberSecession implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		response.setContentType("text/html; charset=UTF-8"); 
		
		int re=service.MemberSecession(request, response);
		request.getSession().invalidate();
		if(re>0) {
			response.getWriter().print("<script>alert('회원 탈퇴가 완료되었습니다.'); location.href='MemberLogin_Action.do'</script>");
			return null;
		}else {
			forward.setRedirect(false);
			forward.setPath("MemberLogin_Action.do");
			return forward;
		}
		
	}

}
