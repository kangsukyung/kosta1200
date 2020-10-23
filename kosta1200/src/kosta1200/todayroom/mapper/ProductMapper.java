package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.ProductVO;

public interface ProductMapper {
	int insertProduct(ProductVO productvo);
	List<ProductVO> listProduct();
	ProductVO detailProduct(int product_seq);
	int updateProduct(ProductVO productvo);

}
