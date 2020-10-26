package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.KnowhowVO;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.RoomwarmingVO;

public class Board_listAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		BoardService service = BoardService.getInstance();
		
		List<BoardVO> list = service.listBoardService(request);
//		List<RoomwarmingVO> list2 = service.listRoomwarmingService();
//		List<KnowhowVO> list3 = service.listKnowhowService();
		List<MemberVO> list4 =service.ListMemberService();
		
		request.setAttribute("list", list);
//		request.setAttribute("list2", list2);
//		request.setAttribute("list3", list3);
		request.setAttribute("list4", list4);
		System.out.println(list4);
		
		String path = "/main_views/board/board_list.jsp";
		forward.setPath(path);
		forward.setRedirect(false);
		
		return forward;
	}

}
