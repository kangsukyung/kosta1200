package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductService;
import kosta1200.todayroom.vo.ProductVO;

public class ProductDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProductService service = ProductService.getInstance();
		
		ProductVO productVO = new ProductVO();
		
		productVO.setProduct_seq(Integer.parseInt(request.getParameter("product_seq")));
		
		service.deleteProductervice(productVO);
		
		
		forward.setRedirect(true);
		forward.setPath("ProductListAction.do");
		
		return forward;
	}

}
