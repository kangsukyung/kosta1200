package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.ConstVO;

public interface ConstMapper {
	int insertConst(ConstVO constVO);
	List<ConstVO> listConst();
}
