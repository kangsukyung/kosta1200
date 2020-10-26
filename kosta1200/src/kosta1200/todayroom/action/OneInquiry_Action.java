package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class OneInquiry_Action implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberService service=MemberService.getInstance();
		response.setContentType("text/html; charset=UTF-8"); 

		int re=service.OneInquiry(request,response);
		if(re>0) {
			response.getWriter().print("<script>alert('1:1문의가 등록되었습니다.'); location.href='Member_Mypage.do'</script>");
			return null;
		}else {
			response.getWriter().print("<script>alert('1:1문의하기를 실패하셨습니다.'); location.href='Member_Mypage.do'</script>");
			return null;
		}
	}

}
