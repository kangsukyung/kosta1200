package kosta1200.todayroom.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class ConstractorSignup_Action implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		response.setContentType("text/html; charset=UTF-8"); 

		int re=service.ConstractorSignup(request, response);
		
		if(re>0) {
			response.getWriter().print("<script>alert('전문가신청이 완료되었습니다.'); location.href='Member_Mypage.do'</script>");
		}else {
			response.getWriter().print("<script>alert('에러 전문가신청을 다시해주세요.'); location.href='Member_Mypage.do'</script>");
		}
		
		return null;
	}

}
