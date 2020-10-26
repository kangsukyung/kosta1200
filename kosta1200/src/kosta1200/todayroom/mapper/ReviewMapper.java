package kosta1200.todayroom.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import kosta1200.todayroom.vo.ReviewVO;

public interface ReviewMapper {

	List<ReviewVO> listReview(RowBounds row);
	
	int insertReview(ReviewVO reviewvo);
	
	int updateReview(ReviewVO reviewvo);
	
	int deleteReview(ReviewVO reviewvo);
	
	int countReview();
}
