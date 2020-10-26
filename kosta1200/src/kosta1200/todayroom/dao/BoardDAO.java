package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.BoardMapper;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.KnowhowVO;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.RoomwarmingVO;

public class BoardDAO {
	
	private static BoardDAO dao = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
				in = Resources.getResourceAsStream(resource);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
		
	}
	
	public int insertBoard(BoardVO board) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertBoard(board);
			if(re >  0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return re;
	}
	
	public int insertRoomwarming(RoomwarmingVO room) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertRoomwarming(room);
			if(re >  0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return re;
	}
	
	public int insertKnowhow(KnowhowVO knowhow) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertKnowhow(knowhow);
			if(re >  0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return re;
	}
	
	public List<BoardVO> listBoard() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<BoardVO> list = null;
		
		try {
			list = sqlSession.getMapper(BoardMapper.class).listBoard();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}
	
	public List<RoomwarmingVO> listRoomwarming() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<RoomwarmingVO> list = null;
		
		try {
			list = sqlSession.getMapper(BoardMapper.class).listRoomwarming();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}
	
	public List<KnowhowVO> listKnowhow() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<KnowhowVO> list = null;
		
		try {
			list = sqlSession.getMapper(BoardMapper.class).listKnowhow();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}
	
	public List<MemberVO> ListMember() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<MemberVO> list = null;
		
		try {
			list = sqlSession.getMapper(BoardMapper.class).ListMember();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}
	
	public BoardVO listDetailBoard(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		BoardVO board = null;
		
		try {
			board = sqlSession.getMapper(BoardMapper.class).listDetailBoard(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return board;
	}
	
	public MemberVO listDetailMember(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		MemberVO member = null;
		
		try {
			member = sqlSession.getMapper(BoardMapper.class).listDetailMember(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return member;
	}
	
	public RoomwarmingVO DetailRoomwarming(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		RoomwarmingVO room = null;
		
		try {
			room = sqlSession.getMapper(BoardMapper.class).DetailRoomwarming(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return room;
	}

	public KnowhowVO DetailKnowhow(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		KnowhowVO knowhow = null;
		
		try {
			knowhow = sqlSession.getMapper(BoardMapper.class).DetailKnowhow(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return knowhow;
	}
}
