package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductService;
import kosta1200.todayroom.vo.ProductVO;

public class ProductDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProductService service = ProductService.getInstance();

		int product_seq = Integer.parseInt(request.getParameter("product_seq")); //글번호 받아오기 
		ProductVO productVO = service.detailProductService(product_seq);
		
		//객체들 가져가기!!!
		request.setAttribute("productVO", productVO);
			
		forward.setRedirect(false);
		forward.setPath("/main_views/product/productDetail.jsp");

		return forward;
	}

}
