package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ScrapVO;

public interface ScrapMapper {
	int insertScrap(ScrapVO scrapVO);
	List<ScrapVO> listScrap(int member_seq);
	

}
