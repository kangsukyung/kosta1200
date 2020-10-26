package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class MemberSignup_Action implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberService service=MemberService.getInstance();
		response.setContentType("text/html; charset=UTF-8"); 
		
		int signup=service.MemberSignup(request, response);
		
		if(signup>0) {
			response.getWriter().print("<script>alert('회원가입에 성공하셨습니다.'); location.href='MemberLogin_Action.do'</script>");
			return null;
		}else {
			response.getWriter().print("<script>alert('회원가입에 실패하셨습니다.'); location.href='MemberSignup_Form.do'</script>");
			return null;
		}
		
	}
}