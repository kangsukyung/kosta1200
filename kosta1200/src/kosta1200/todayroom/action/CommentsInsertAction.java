package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.vo.CommentsVO;

public class CommentsInsertAction implements Action {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		CommentsService service = CommentsService.getInstance();
		
//		CommentsVO commentsvo = new CommentsVO();
//		commentsvo.setComments_content(request.getParameter("comments_content"));
//		commentsvo.setComments_picture(request.getParameter("comments_picture"));
		service.CommentsInsertService(request);
		
		forward.setRedirect(true);
		forward.setPath("CommentsListAction.do");
		
		return forward;
	}
}
