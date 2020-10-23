package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ProductVO;

public interface StoreMapper {
	List<ProductVO> listProduct(int seq);
	ProductVO FilterPrice(int price);
	List<BoardVO> listStore();
	BoardVO detailStore(int seq);
}