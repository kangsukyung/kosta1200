package kosta1200.todayroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.vo.CommentsVO;
import kosta1200.todayroom.vo.Comments_PagingVO;

public class CommentsListAction implements Action{
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		ActionForward forward = new ActionForward();
		CommentsService service = CommentsService.getInstance();
		
		
		Comments_PagingVO list = service.listCommentsService(request);
		
		System.out.println("list안에 :: "+ list);
		request.setAttribute("list", list);
		
		forward.setRedirect(false);
		forward.setPath("/main_views/comments/comments.jsp");
		return forward;
	
	
	
	}
}
