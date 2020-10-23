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
import kosta1200.todayroom.action.InsertProductInquiryAction;

/**
 * Servlet implementation class ProductInquiryController
 */
@WebServlet("/productInquiry/*")
public class ProductInquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductInquiryController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String command = uri.substring(uri.lastIndexOf("/productInquiry/") + 16);
		
		System.out.println(uri);
		System.out.println(command);

		Action action = null;
		ActionForward forward = null;

		if (command.equals("insertProductInquiry.do")) {
			action = new InsertProductInquiryAction();

			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
