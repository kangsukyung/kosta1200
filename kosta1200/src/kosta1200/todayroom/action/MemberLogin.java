package kosta1200.todayroom.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.MemberService;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.MemberVO;

public class MemberLogin implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=new ActionForward();
		MemberService service=MemberService.getInstance();
		MemberVO member=service.MemberLogin(request, response);
		response.setContentType("text/html; charset=UTF-8"); 
		
		if(member!=null) {
			if(member.getMember_rating().equals("0")) {
				response.getWriter().print("<script>alert('탈퇴처리된 회원입니다.'); location.href='MemberLogin_Action.do'</script>");
				return null;
			}else {
				int num=member.getMember_seq();
				List<BoardVO> room=service.MyRoomList(num);
				List<BoardVO> knowhow=service.MyKnowhowList(num);
				request.getSession().setAttribute("room", room);
				request.getSession().setAttribute("knowhow", knowhow);
				
				request.getSession().setAttribute("member", member);
				response.getWriter().print("<script>alert('로그인 하셨습니다'); location.href='Member_Mypage.do'</script>");
				return null;
			}
		}else if(member==null){
			response.getWriter().print("<script>alert('아이디 비밀번호를 확인해주세요'); location.href='MemberLogin_Action.do'</script>");
			return null;
		}
		
		return null;
		
	}

}
