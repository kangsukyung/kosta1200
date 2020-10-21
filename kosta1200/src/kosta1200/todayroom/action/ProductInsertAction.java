package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductService;

public class ProductInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProductService service = ProductService.getInstance();
		
		service.insertProduct(request);
		
		forward.setRedirect(true); 
		forward.setPath("ProductInsertActionForm.do");
		
		
		return forward;

	}

}
