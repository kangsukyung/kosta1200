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
import kosta1200.todayroom.action.ProductInsertActionForm;
import kosta1200.todayroom.action.ScrapInsertAction;
import kosta1200.todayroom.action.ScrapListAction;


@WebServlet("/Scrap/*")
public class ScrapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ScrapController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    	String requestURI = request.getRequestURI();
    	System.out.println(requestURI); //=> /http://localhost:8081/PracticeMVC/board/*
    	String contextPath = request.getContextPath();
    	System.out.println(contextPath); //=> /PracticeMVC
    	String command = requestURI.substring(contextPath.length()+7); // 7의 뜻 : /board/ -> 이걸 짜르겠단거임
    	System.out.println(command);// => *
    	
    	Action action = null;
    	ActionForward forward = null;

    	
    	if(command.equals("ScrapInsertAction.do")) {
    		action = new ScrapInsertAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	} else if(command.equals("ScrapListAction.do")) {
    		action = new ScrapListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
		

		 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 //==========================================================================================================
    	
    	if(forward != null) { //forward가 null이 아닐때
    		if(forward.isRedirect()) { //새로운 요청
    			response.sendRedirect(forward.getPath());
    		}else {
    			RequestDispatcher dispatcher =
    					request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
    		}
    	}
    	
    	
    }//end doProcess


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
