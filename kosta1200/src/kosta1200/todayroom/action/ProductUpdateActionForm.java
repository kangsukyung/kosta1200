package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductService;
import kosta1200.todayroom.vo.ProductVO;

public class ProductUpdateActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProductService service = ProductService.getInstance(); //서비스 객체 받아오기
		
		int product_seq = Integer.parseInt(request.getParameter("product_seq")); //글번호 받아오기 
		ProductVO productVO = service.detailProductService(product_seq);
		
		request.setAttribute("productVO", productVO);
		
		forward.setRedirect(false);
		forward.setPath("/main_views/product/product_update_form.jsp");
		
				
		return forward;
	}

}
