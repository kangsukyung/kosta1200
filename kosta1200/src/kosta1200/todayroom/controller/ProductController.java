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
import kosta1200.todayroom.action.ProductDetailAction;
import kosta1200.todayroom.action.ProductInsertAction;
import kosta1200.todayroom.action.ProductInsertActionForm;
import kosta1200.todayroom.action.ProductListAction;


@WebServlet("/Product/*")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductController() {
        super();
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    	String requestURI = request.getRequestURI();
    	//System.out.println(requestURI); //=> /http://localhost:8081/PracticeMVC/board/*
    	String contextPath = request.getContextPath();
    	//System.out.println(contextPath); //=> /PracticeMVC
    	String command = requestURI.substring(contextPath.length()+9); // 7의 뜻 : /board/ -> 이걸 짜르겠단거임
    	//System.out.println(command);// => *
    	
    	Action action = null;
    	ActionForward forward = null;
    	
    	if(command.equals("ProductInsertActionForm.do")) {
    		action = new ProductInsertActionForm();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	} else if(command.equals("ProductInsertAction.do")) {
    		action = new ProductInsertAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	} else if(command.equals("ProductListAction.do")) {
    		action = new ProductListAction();
    		try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	} else if(command.equals("ProductDetailAction.do")) {
    		action = new ProductDetailAction();
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
