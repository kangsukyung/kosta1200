package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductInquiryService;

public class insertProductInquiryAnswerAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ProductInquiryService service = ProductInquiryService.getInstance();
		
		int re = -1;
		
		re = service.insertProductInquiryAnswerService(request);
		
		response.getWriter().print(re);
		
		return null;
	}

}
