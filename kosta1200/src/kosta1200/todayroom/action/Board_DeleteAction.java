package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;

public class Board_DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("board_seq"));
		
		service.deleteRoomwarmingService(seq);
		service.deleteKnowhowService(seq);
		service.deleteBoardService(seq);
		
		String path = "listAction.do";
		forward.setPath(path);
		forward.setRedirect(true);
		
		return forward;
	}

}
