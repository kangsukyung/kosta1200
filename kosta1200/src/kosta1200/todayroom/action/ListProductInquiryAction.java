package kosta1200.todayroom.action;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta1200.todayroom.service.ProductInquiryService;
import kosta1200.todayroom.service.ProductService;
import kosta1200.todayroom.vo.ProductVO;
import kosta1200.todayroom.vo.Product_inquiryVO;

public class ListProductInquiryAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ActionForward forward = new ActionForward();
		
		ProductInquiryService service1 = ProductInquiryService.getInstance();
		ProductService service2 = ProductService.getInstance();
		
		List<Product_inquiryVO> inquiryList = service1.listProductInquiryService();
		
		Map<ProductVO, Product_inquiryVO> list = new LinkedHashMap<ProductVO, Product_inquiryVO>();
		
		ProductVO product = null;
//		String name = null;
		Product_inquiryVO inquiry = null;
		
		for(int i=0; i<inquiryList.size(); i++) {
			inquiry = inquiryList.get(i);
			
			product = service2.detailProductService(inquiry.getProduct_seq());
			
//			name = product.getProduct_name();
//			System.out.println(name);
			System.out.println(inquiry);
			
			list.put(product, inquiry);
		}
		
		
		request.setAttribute("list", list);
		
		forward.setPath("/main_views/productInquiry/listProductInquiry.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
