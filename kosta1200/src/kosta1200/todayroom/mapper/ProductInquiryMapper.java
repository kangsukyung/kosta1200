package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.Product_inquiryVO;

public interface ProductInquiryMapper {
	int insertProductInquiry(Product_inquiryVO product_inquiryVO);
	List<Product_inquiryVO> listProductInquiry();
}
