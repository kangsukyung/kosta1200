package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.vo.CommentsVO;

public class CommentsDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentsService service = CommentsService.getInstance();
		
		CommentsVO commentsvo = new CommentsVO();
		commentsvo.setComments_seq(Integer.parseInt(request.getParameter("comments_seq")));
		service.DeleteCommentsService(commentsvo);
		
		
		
		forward.setRedirect(true);
		forward.setPath("CommentsListAction.do");
		
		return forward;
	}

}
