package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.StoreMapper;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ProductVO;

public class StoreDAO {
	private static StoreDAO dao = new StoreDAO();
	
	public static StoreDAO getInstance() {
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
	
	public List<ProductVO> listProduct(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<ProductVO> list = null;
		
		try {
			list = sqlSession.getMapper(StoreMapper.class).listProduct(seq);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return list;
	}

	public List<BoardVO> listStore() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<BoardVO> list = null;
		
		try {
			list = sqlSession.getMapper(StoreMapper.class).listStore();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return list;

	}
	
	public int FilterPrice(int price) {
		int check = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			ProductVO product = null;
			product = sqlSession.getMapper(StoreMapper.class).FilterPrice(price);
			if ( product != null) {
				check = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return check;
	}
	
	public BoardVO detailStore(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		BoardVO boardVO = null;
		try {
			boardVO = sqlSession.getMapper(StoreMapper.class).detailStore(seq);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boardVO;
	}
	
}
