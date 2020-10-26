package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductService;
import kosta1200.todayroom.vo.ProductVO;

public class ProductUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProductService service = ProductService.getInstance(); //서비스 객체 받아오기
		request.setCharacterEncoding("utf-8"); //한글 안깨지게
		
		ProductVO productVO = new ProductVO();
		productVO.setProduct_seq(Integer.parseInt(request.getParameter("product_seq")));
		productVO.setProduct_name(request.getParameter("product_name"));
		productVO.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
		productVO.setProduct_lcategory(request.getParameter("product_lcategory"));
		productVO.setProduct_scategory(request.getParameter("product_scategory"));
				
		service.updateProductervice(productVO);
		
		forward.setRedirect(true); //뷰로 가는것이 아니라 또다른 요청이니깐 true
		forward.setPath("ProductListAction.do");

		return forward;
	
	}

}
