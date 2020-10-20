package kosta1200.todayroom.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kosta1200.todayroom.dao.StoreDAO;
import kosta1200.todayroom.dto.Product;

public class StoreService {
	private static StoreService service = new StoreService();
	private static StoreDAO dao;

	public static StoreService getInstance() {
		dao = StoreDAO.getInstance();
		return service;
	}
	
	public List<Product> listProductService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		List<Product> list = dao.listProduct();
		return list;
	}
	
}
