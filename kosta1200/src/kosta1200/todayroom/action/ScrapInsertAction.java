package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.BoardService;
import kosta1200.todayroom.service.ScrapService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.ScrapVO;

public class ScrapInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ScrapService service1 = ScrapService.getInstance(); //서비스 객체 받아오기
		BoardService service2 = BoardService.getInstance();
		
		ScrapVO scrapVO = new ScrapVO();
		
		int seq = Integer.parseInt(request.getParameter("board_seq"));
		
		scrapVO.setBoard_seq(seq);
		scrapVO.setMember_seq(Integer.parseInt(request.getParameter("member_seq")));
		
		service1.insertScrapService(scrapVO);
		
		BoardVO board = service2.listDetailBoardService(seq);
		request.setAttribute("board", board);
		
		
		String path = "/main_views/board/board_listdetail.jsp";
		forward.setPath(path);
		forward.setRedirect(false);
		return forward;
	}

}
