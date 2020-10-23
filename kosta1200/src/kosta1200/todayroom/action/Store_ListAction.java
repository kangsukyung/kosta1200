package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.StoreService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ProductVO;

public class Store_ListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		StoreService service = StoreService.getInstance();
		List<BoardVO> list = service.listStoreService(request);
		
		request.setAttribute("list", list);
		forward.setRedirect(false);
		forward.setPath("/main_views/store/storemain.jsp");
		
		return forward;
	}

}
