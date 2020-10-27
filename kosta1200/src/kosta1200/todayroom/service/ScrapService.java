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
	
	public int insertScrapService(ScrapVO scrapVO)throws Exception{	
		return dao.insertScrap(scrapVO);
		
	}
	
	
	
	
	
	
	

}
