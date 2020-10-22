package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductInquiryService;

public class InsertProductInquiryAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub		
		
		int re = -1;
		
		ProductInquiryService service = ProductInquiryService.getInstance();
		
		re = service.insertProductInquiryService(request);
		
		response.setContentType("text/html; charset=UTF-8");

		if (re > 0) {
			response.getWriter().println("<script>alert('문의가 접수되었습니다.');</script>");
		} else {
			response.getWriter().println("<script>alert('양식을 다시 확인해주세요.'); history.back();</script>");
		}

		return null;
	}

}
