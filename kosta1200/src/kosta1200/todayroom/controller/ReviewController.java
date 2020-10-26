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
import kosta1200.todayroom.action.ReviewDeleteAction;
import kosta1200.todayroom.action.ReviewInsertAction;
import kosta1200.todayroom.action.ReviewListAction;

/**
 * Servlet implementation class ReviewController
 */
@WebServlet("/Review/*")
public class ReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReviewController() {
        super();
    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+8);
    	System.out.println(command);
    	Action action = null;
    	ActionForward forward = null;

    	if(command.equals("ReviewListAction.do")){
    		System.out.println("리스트액션으로 이동");
    		action = new ReviewListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if(command.equals("ReviewInsertAction.do")){
    		action = new ReviewInsertAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	/*}else if(command.equals("ReviewUpdateAction.do")){
    		action = new ReviewUpdateAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
    	}else if(command.equals("ReviewDeleteAction.do")){
    		action = new ReviewDeleteAction();
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
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
