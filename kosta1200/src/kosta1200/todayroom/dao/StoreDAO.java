package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.StoreMapper;
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
	
	public List<ProductVO> listProduct() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<ProductVO> list = null;
		
		try {
			list = sqlSession.getMapper(StoreMapper.class).listProduct();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return list;
	}
		
}
