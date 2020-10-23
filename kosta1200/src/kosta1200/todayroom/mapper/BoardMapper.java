package kosta1200.todayroom.mapper;

import java.util.HashMap;
import java.util.Map;

import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.KnowhowVO;
import kosta1200.todayroom.vo.RoomwarmingVO;

public interface BoardMapper {
	int insertBoard(BoardVO board);
	int insertRoomwarming(RoomwarmingVO room);
	int insertKnowhow(KnowhowVO knowhow);
}
