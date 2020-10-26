package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.KnowhowVO;
import kosta1200.todayroom.vo.RoomwarmingVO;

public class Board_UpdateActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("board_seq"));
		BoardVO board = service.listDetailBoardService(seq);
		request.setAttribute("board", board);
		
		RoomwarmingVO room = service.DetailRoomwarmingService(seq);
		KnowhowVO knowhow = sevice.DetailKnowhowService(seq);
		
		String path = "/main_views/board/board_update_form.jsp";
		forward.setPath(path);
		forward.setRedirect(false);
		
		return forward;
	}

}
