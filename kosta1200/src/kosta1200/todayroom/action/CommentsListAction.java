package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.vo.CommentsVO;

public class CommentsListAction implements Action{
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ActionForward forward = new ActionForward();
		CommentsService service = CommentsService.getInstance();
		
		//int board_seq = Integer.parseInt(request.getParameter("board_seq"));
		List<CommentsVO> list = service.listCommentsService();
		request.setAttribute("comments", list);
		
		forward.setRedirect(false);
		forward.setPath("/main_views/comments/comments.jsp");
		return forward;
	
	
	
	}
}
