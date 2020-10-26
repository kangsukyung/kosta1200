package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;
import kosta1200.todayroom.vo.BoardVO;

public class Board_UpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("board_seq"));
		BoardVO board = service.listDetailBoardService(seq);
		request.setAttribute("board", board);
		
		String path = "/main_views/board/board_update_form.jsp";
		forward.setPath(path);
		forward.setRedirect(false);
		
		return forward;
	}

}
