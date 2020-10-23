package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.StoreService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ProductVO;

public class Store_DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		StoreService service = StoreService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("board_seq"));
		System.out.println("seq:" + seq);
		BoardVO board = service.detailStoreService(seq);
		List<ProductVO> list = service.listProductService(seq);
		
		request.setAttribute("board", board);
		request.setAttribute("list", list);
		System.out.println("상품 리스트 : " + list);
		
		forward.setRedirect(false);
		forward.setPath("/main_views/store/storedetail.jsp");
				
		return forward;
	}

}
