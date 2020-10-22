package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.ProductMapper;
import kosta1200.todayroom.vo.ProductVO;

public class ProductDAO {
	private static ProductDAO dao = new ProductDAO();
	
		public static ProductDAO getInstance() {
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
		
	}// end SqlSessionFactory
	
	
	public int insertProduct(ProductVO productVO) {
		int re = -1;

		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			re = sqlSession.getMapper(ProductMapper.class).insertProduct(productVO);
			System.out.println(re);
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
	} //end insertProduct
	
	public List<ProductVO> listProduct(){
		SqlSession sqlSession = getSqlSessionFactory().openSession(); //sqlSession 구하기
		List<ProductVO> list = null; //변수선언
		
		try {
			list = sqlSession.getMapper(ProductMapper.class).listProduct();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
		
	}//end listProduct
	
	
	public ProductVO detailProduct(int product_seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		ProductVO productVO = null;	
		try {
			productVO = sqlSession.getMapper(ProductMapper.class).detailProduct(product_seq);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return productVO;
	}//end detailProduct
	
	
	
	
	
	
	
	
	
	
	

}//end ProductDAO
