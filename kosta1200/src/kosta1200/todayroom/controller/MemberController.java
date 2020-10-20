package kosta1200.todayroom.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.action.Action;
import kosta1200.todayroom.action.ActionForward;


@WebServlet("/Member/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberController() {
        super();
    }
    

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()+8);
		Action action = null;
		ActionForward forward = null;
		
		System.out.println(command);
//		if (command.equals("MemberIdCheckList.do")) {
//			action = new MemberIdCheckList();
//			try {
//				forward = action.execute(request, response);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		if (forward != null) {
//			if (forward.isRedirect()) {
//				response.sendRedirect(forward.getPath());
//			} else {
//				RequestDispatcher dispacher = request.getRequestDispatcher(forward.getPath());
//				dispacher.forward(request, response);
//			}
//		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
