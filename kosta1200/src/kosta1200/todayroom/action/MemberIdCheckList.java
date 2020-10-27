package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;

public class MemberIdCheckList implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberService service=MemberService.getInstance();
		response.setContentType("text/html; charset=UTF-8"); 

		int num=service.MemberIdCheckList(request, response);
		System.out.println("1");
		System.out.println(num);
		response.getWriter().print(num);
		return null;
	}
}