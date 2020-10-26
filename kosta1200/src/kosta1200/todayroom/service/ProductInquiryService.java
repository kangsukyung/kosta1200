package kosta1200.todayroom.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kosta1200.todayroom.dao.ProductInquiryDAO;
import kosta1200.todayroom.vo.Product_inquiryVO;

public class ProductInquiryService {
	private static ProductInquiryService service = new ProductInquiryService();
	private static ProductInquiryDAO dao = null;
	public static ProductInquiryService getInstance() {
		dao = ProductInquiryDAO.getInstance();
		
		return service;
	}
	
	public int insertProductInquiryService(HttpServletRequest request) {
		int re =-1;
		
		Product_inquiryVO VO = new Product_inquiryVO();
		
		VO.setMember_seq(Integer.parseInt(request.getParameter("member_seq")));
		VO.setProduct_seq(Integer.parseInt(request.getParameter("product_seq")));
		VO.setPi_type(request.getParameter("pi_type"));
		VO.setPi_content(request.getParameter("pi_content"));
		
		re=dao.insertProductInquiry(VO);
		
		return re;
	}
	
	public List<Product_inquiryVO> listProductInquiryService() {
		List<Product_inquiryVO> list = null;
		
		list = dao.listProductInquiry();
		
//		request.setAttribute("list", list);
		
		return list;
	}
	
	public int insertProductInquiryAnswerService(HttpServletRequest request) {
		int re =-1;
		
		Product_inquiryVO VO = new Product_inquiryVO();
		
		VO.setPi_seq(Integer.parseInt(request.getParameter("pi_seq")));
		VO.setPi_answer(request.getParameter("pi_answer"));
		
		re=dao.insertProductInquiryAnswer(VO);
		
		return re;
	} 
}
