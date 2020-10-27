package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;
import kosta1200.todayroom.vo.MemberVO;

public class MemberUpdate_Action implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		
		MemberVO member=service.MemberUpdate(request, response);
		
		request.getSession().setAttribute("member", member);
			
		forward.setRedirect(false);
		forward.setPath("MemberUpdate_form.do");
		return forward;
	}

}
