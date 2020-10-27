package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;
import kosta1200.todayroom.vo.BoardVO;

public class Member_Mypage implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		
		forward.setRedirect(false);
		forward.setPath("../main_views/member/member_mypage.jsp");
		return forward;
	}
	
}
