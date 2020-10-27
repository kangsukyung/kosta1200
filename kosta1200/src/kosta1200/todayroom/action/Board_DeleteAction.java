package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;
import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.vo.Comments_PagingVO;

public class Board_DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("board_seq"));
		
		//댓글 리스트 부분
		CommentsService service2 = CommentsService.getInstance();
		Comments_PagingVO list2 = service2.listCommentsService(request);
		System.out.println("list안에 :: "+ list2);
		request.setAttribute("list2", list2);
		
		
		service.deleteRoomwarmingService(seq);
		service.deleteKnowhowService(seq);
		service.deleteBoardService(seq);
		
		String path = "listAction.do";
		forward.setPath(path);
		forward.setRedirect(true);
		
		return forward;
	}

}
