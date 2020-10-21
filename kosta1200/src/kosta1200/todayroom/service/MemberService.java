<<<<<<< HEAD
package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import kosta1200.todayroom.dao.MemberDAO;

public class MemberService {
	private static MemberService service=new MemberService();
	private static MemberDAO dao;
	
	public static MemberService getInstance() {
		dao=MemberDAO.getInstance();
		return service;
	}
	
	
	public int MemberIdCheckList(HttpServletRequest request,HttpServletResponse response){
		String id=request.getParameter("userid");
		System.out.println(id);
		return dao.MemberIdCheckList(id);
	}
}
=======
>>>>>>> refs/heads/develop
