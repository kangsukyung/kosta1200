package kosta1200.todayroom.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ConstService;

public class InsertConstAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		/* ActionForward forward = new ActionForward(); */
		
		int re = -1;
		
		ConstService service = ConstService.getInstance();
		re = service.insertConstService(request);
		
		response.setContentType("text/html; charset=UTF-8");
		
		if(re>0) {
			response.getWriter().println("<script>alert('신청되었습니다.'); location.href='insertConstForm.do'</script>");
		}else {
			response.getWriter().println("<script>alert('양식을 다시 확인해주세요.'); history.back();</script>");
		}
		
		/*
		 * forward.setPath("insertConstForm.do"); forward.setRedirect(true);
		 */
		return null;
	}

}
