package kosta1200.todayroom.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import kosta1200.todayroom.dao.ProductDAO;
import kosta1200.todayroom.vo.ProductVO;

public class ProductService {
	private static ProductService service = new ProductService();
	private static ProductDAO dao;
	
	public static ProductService getInstance() {
		dao = ProductDAO.getInstance();
		return service;
	}
	
	public int insertProduct(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		
		ProductVO productVO = new ProductVO();
		productVO.setProduct_name(request.getParameter("product_name"));
		productVO.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
		productVO.setProduct_lcategory(request.getParameter("product_lcategory"));
		productVO.setProduct_scategory(request.getParameter("product_scategory"));
		
		return dao.insertProduct(productVO);
	
	}//end insertProduct
	

}
