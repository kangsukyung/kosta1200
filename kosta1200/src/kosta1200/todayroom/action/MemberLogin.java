package kosta1200.todayroom.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import kosta1200.todayroom.service.MemberService;
import kosta1200.todayroom.vo.MemberVO;

public class MemberLogin implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		MemberVO member=service.MemberLogin(request, response);
		if(member!=null) {
			System.out.println("1");
			request.getSession().setAttribute("member", member);
			forward.setRedirect(true);
			forward.setPath("../main_views/member/member_mypage.jsp");//마이페이지
			
		}else if(member==null){
			forward.setRedirect(false);
			forward.setPath("MemberLogin_Action.do");
		}
		
		return forward;
	}

}
