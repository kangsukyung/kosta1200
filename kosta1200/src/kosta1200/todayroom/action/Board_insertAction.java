package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;

public class Board_insertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
				
		service.insertBoardService(request);
		service.insertRoomwarmingService(request);
		
		String path = "listAction.do";
		forward.setRedirect(true);
		forward.setPath(path);
		
		return forward;
	}

}
