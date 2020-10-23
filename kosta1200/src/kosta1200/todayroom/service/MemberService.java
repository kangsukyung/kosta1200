package kosta1200.todayroom.service;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import kosta1200.todayroom.dao.MemberDAO;
import kosta1200.todayroom.vo.MemberVO;

public class MemberService {
	private static MemberService service=new MemberService();
	private static MemberDAO dao;
	
	public static MemberService getInstance() {
		dao=MemberDAO.getInstance();
		return service;
	}
	
	
	public int MemberIdCheckList(HttpServletRequest request,HttpServletResponse response){
		String id=request.getParameter("userid");
		return dao.MemberIdCheckList(id);
	}
	
	public int MemberNickNameCheck(HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("userName");
		return dao.MemberNickNameCheck(name);
	}
	public int MemberSignup(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		MemberVO member=new MemberVO();
		member.setMember_address(request.getParameter("memberAddress"));
		member.setMember_email(request.getParameter("memberEmail"));
		member.setMember_id(request.getParameter("memberId"));
		member.setMember_name(request.getParameter("memberName"));
		member.setMember_nickname(request.getParameter("memberNickname"));
		member.setMember_password(request.getParameter("memberPassword"));
		member.setMember_phone(request.getParameter("memberPhone"));
		
		return dao.MemberSignup(member);
	}
	public MemberVO MemberLogin(HttpServletRequest request,HttpServletResponse response){
		System.out.println("login");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		MemberVO member=new MemberVO();
		member.setMember_id(request.getParameter("name"));
		member.setMember_password(request.getParameter("password"));

		
		return dao.MemberLogin(member);
	}
}
