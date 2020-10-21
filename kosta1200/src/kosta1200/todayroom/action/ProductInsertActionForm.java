package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductInsertActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();

		forward.setRedirect(false);
		
		forward.setPath("/main_views/product/product_insert_form.jsp");
				
		return forward;
	}

}
