package kosta1200.todayroom.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.dao.StoreDAO;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ProductVO;

public class StoreService {
	private static StoreService service = new StoreService();
	private static StoreDAO dao;

	public static StoreService getInstance() {
		dao = StoreDAO.getInstance();
		return service;
	}
	
	public List<ProductVO> listProductService(int seq) throws Exception{
		return dao.listProduct(seq);
	}
	
	public int FilterPriceService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String price = request.getParameter("price");
		int int_price = Integer.parseInt(price);
		System.out.println(price);
		return dao.FilterPrice(int_price);
	}
	
	public List<BoardVO> listStoreService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		List<BoardVO> list = dao.listStore();
		return list;
	}
	
	public BoardVO detailStoreService(int seq) throws Exception{
		return dao.detailStore(seq);
	}
}
