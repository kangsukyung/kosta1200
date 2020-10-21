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
import kosta1200.todayroom.action.Store_DetailAction;
import kosta1200.todayroom.action.Store_ListAction;
import kosta1200.todayroom.action.Store_ListStoreAction;

@WebServlet("/store/*")
public class StoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StoreController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+7);
    	
    	System.out.println(command);
    	
    	Action action = null;
    	ActionForward forward = null;
    	
    	if (command.equals("listAction.do")) {
    		action = new Store_ListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	if (command.equals("listStoreAction.do")) {
    		action = new Store_ListStoreAction();
    		try {
    			forward = action.execute(request, response);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	if (command.equals("filterPrice.do")) {
    		action = new Store_ListAction();
    		try {
    			forward = action.execute(request, response);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	if (command.equals("StoreDetailAction.do")) {
    		action = new Store_DetailAction();
    		try {
    			forward = action.execute(request, response);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	
    	if (forward != null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		} else {
    			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request, response);
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
