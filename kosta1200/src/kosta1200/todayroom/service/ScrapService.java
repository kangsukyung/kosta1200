package kosta1200.todayroom.service;

import javax.servlet.http.HttpServletRequest;

import kosta1200.todayroom.dao.ScrapDAO;
import kosta1200.todayroom.vo.ScrapVO;

public class ScrapService {
	
	private static ScrapService service = new ScrapService();
	private static ScrapDAO dao;
	public static ScrapService getInstance() {
		dao = ScrapDAO.getInstance();
		
		return service;
	}
	
	public int insertScrapService(HttpServletRequest request)throws Exception{
		ScrapVO scrapVO = new ScrapVO(); //보드에 추가해야하니간 보드객체 불러야 함
		
		scrapVO.setBoard_seq(Integer.parseInt(request.getParameter("board_seq")));
		scrapVO.setMember_seq(Integer.parseInt(request.getParameter("member_seq")));
		
		return dao.insertScrap(scrapVO);
		
	}
	
	
	
	
	
	
	

}
