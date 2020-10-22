package kosta1200.todayroom.dao;

import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.BoardMapper;
import kosta1200.todayroom.vo.BoardVO;

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
	
}
