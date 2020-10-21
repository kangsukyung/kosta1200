package kosta1200.todayroom.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kosta1200.todayroom.dao.ConstDAO;
import kosta1200.todayroom.vo.ConstVO;

public class ConstService {
	private static ConstService service = new ConstService();
	private static ConstDAO dao = null;
	
	public static ConstService getInstance() {
		dao = ConstDAO.getInstance();
		return service;
	}
	
	public int insertConstService(HttpServletRequest request) {
		int re = -1;
		
		ConstVO constVO = new ConstVO();
		
		constVO.setMember_seq(Integer.parseInt(request.getParameter("member_seq")));
		constVO.setConst_space(request.getParameter("const_space"));
		constVO.setConst_style(request.getParameter("const_style"));
		constVO.setConst_color(request.getParameter("const_color"));
		constVO.setConst_budget(request.getParameter("const_budget"));
		constVO.setConst_type(request.getParameter("const_type"));		
		
		re = dao.insertConst(constVO);

		return re;
	}
	
	public void listConstService(HttpServletRequest request) {
		List<ConstVO> list = dao.listConst();
		
		request.setAttribute("list", list);
	}
}
