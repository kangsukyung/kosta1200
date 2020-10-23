package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductInquiryService;

public class ListProductInquiryAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ActionForward forward = new ActionForward();
		
		ProductInquiryService service = ProductInquiryService.getInstance();
		
		service.listProductInquiryService(request);
		
		forward.setPath("/listProductInquiry.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
