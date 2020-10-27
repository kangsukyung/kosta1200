package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.service.ReviewService;
import kosta1200.todayroom.service.StoreService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.Comments_PagingVO;
import kosta1200.todayroom.vo.ProductVO;
import kosta1200.todayroom.vo.Review_PagingVO;

public class Store_DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		StoreService service = StoreService.getInstance();
		
		
		ReviewService service2 = ReviewService.getInstance();
		Review_PagingVO list2 = service2.listReviewService(request);
		request.setAttribute("list2", list2);
		
		
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
