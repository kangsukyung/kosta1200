package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kosta1200.todayroom.service.BasketService;
import kosta1200.todayroom.vo.BasketVO;

public class BasketListActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BasketService service = BasketService.getInstance();
    	
		
//		String[] str = request.getParameterValues("product_seq");
		
//		BasketVO basket = new BasketVO();
//		for (int i=0; i<str.length; i++) {
//			basket.setBasket_seq(Integer.parseInt(request.getParameter("basket_seq")));
//			basket.setBasket_quantity((request.getParameter("basket_quantity")));
//			basket.setProduct_seq(Integer.parseInt(str[i]));
//		}
//		request.getSession().setAttribute("basket", basket);
		
		forward.setRedirect(false);
		forward.setPath("/main_views/basket/basketaddlist.jsp");
			
		return forward;
	}

}
