package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;

public class Board_listAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
		
		
		String path = "/main_views/board/board_list.jsp";
		forward.setPath(path);
		forward.setRedirect(false);
		
		return forward;
	}

}
