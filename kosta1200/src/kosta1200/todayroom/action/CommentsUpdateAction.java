package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.CommentsService;
import kosta1200.todayroom.vo.CommentsVO;

public class CommentsUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentsService service = CommentsService.getInstance();
		
		int comments_seq = Integer.parseInt(request.getParameter("comments_seq")); 
		System.out.println("request안에 seq : "+comments_seq);
		//comments_seq인 글을 가져와야함
//		CommentsVO comments = service.listCommentsService()
		//request.setAttribute("comments", comments);
				
		
		/*
		comments.setComments_seq(Integer.parseInt(request.getParameter("comments_seq")));
		comments.setComments_content(request.getParameter("comments_content"));
		comments.setComments_picture(request.getParameter("comments_picture"));
		*/
		service.updateCommentsService(request,comments_seq);
		
		forward.setRedirect(true);
		forward.setPath("ListCommentsAction.do");
		
		return forward;
	}

}
