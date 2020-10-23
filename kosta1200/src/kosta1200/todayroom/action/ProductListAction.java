package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductService;
import kosta1200.todayroom.vo.ProductVO;

public class ProductListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProductService service = ProductService.getInstance();
		
		List<ProductVO> list = service.listProductService();
		
		request.setAttribute("list", list);
		
		forward.setRedirect(false);
		forward.setPath("/main_views/product/productList.jsp");
			
		return forward;
	}

}
