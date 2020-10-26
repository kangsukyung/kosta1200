package kosta1200.todayroom.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kosta1200.todayroom.dao.BasketDAO;
import kosta1200.todayroom.vo.BasketVO;

public class BasketService {
	private static BasketService service = new BasketService();
	private static BasketDAO dao;
	
	public static BasketService getInstance() {
		dao = BasketDAO.getInstance();
		return service;
	}
	
	public int insertBasketService(BasketVO basket) throws Exception {
		return dao.insertBasket(basket);
	}
	
}
