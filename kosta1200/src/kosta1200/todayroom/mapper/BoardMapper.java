package kosta1200.todayroom.mapper;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.KnowhowVO;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.RoomwarmingVO;

public interface BoardMapper {
	int insertBoard(BoardVO board);
	int insertRoomwarming(RoomwarmingVO room);
	int insertKnowhow(KnowhowVO knowhow);
	
	List<BoardVO> listBoard();
	List<RoomwarmingVO> listRoomwarming();
	List<KnowhowVO> listKnowhow();
	List<MemberVO> ListMember();
	
	BoardVO listDetailBoard(int seq);
	MemberVO listDetailMember(int seq);
	
	RoomwarmingVO DetailRoomwarming(int seq);
	KnowhowVO DetailKnowhow(int seq);
}
