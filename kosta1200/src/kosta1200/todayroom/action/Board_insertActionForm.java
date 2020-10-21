package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.StoreService;
import kosta1200.todayroom.vo.ProductVO;

public class Board_insertActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();

		String path = "/main_views/board/board_insert_form.jsp";
		forward.setPath(path);
		forward.setRedirect(false);
				
		return forward;
	}

}
