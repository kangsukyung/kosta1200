package kosta1200.todayroom.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.action.Action;
import kosta1200.todayroom.action.ActionForward;
import kosta1200.todayroom.action.CommentsDeleteAction;
import kosta1200.todayroom.action.CommentsInsertAction;
import kosta1200.todayroom.action.CommentsListAction;
import kosta1200.todayroom.action.CommentsUpdateAction;

/**
 * Servlet implementation class CommentsController
 */
@WebServlet("/Comments/*" )
public class CommentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CommentsController() {
        super();
    }

	private void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		//System.out.println(requestURI);
		String contextPath = request.getContextPath();
		//System.out.println(contextPath);
    	String command = requestURI.substring(contextPath.length()+10);
    	//System.out.println(command);
    	
    	Action action = null;
    	ActionForward forward = null;
    	
    	if(command.equals("CommentsListAction.do")){
    		action = new CommentsListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("CommentsInsertAction.do")){
    		action = new CommentsInsertAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("CommentsUpdateAction.do")){
    		action = new CommentsUpdateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("CommentsDeleteAction.do")){
    		action = new CommentsDeleteAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	
    	
    	
    	
    	
    	
    	if(forward != null){
    		if(forward.isRedirect()){
    			response.sendRedirect(forward.getPath());
    		}else{
    			RequestDispatcher dispacher = request.getRequestDispatcher(forward.getPath());
    			dispacher.forward(request, response);
    		}
    	}
    	
    	
    	
    	
    	
	}
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


}
