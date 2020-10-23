package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.vo.Product_inquiryVO;

public class ProductInquiryDAO {
	private static ProductInquiryDAO dao = new ProductInquiryDAO();
	public static ProductInquiryDAO getInstance() {
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
	
	public int insertProductInquiry(Product_inquiryVO product_inquiryVO) {
		int re = -1;
		
		SqlSession session = getSqlSessionFactory().openSession();
		
		try {
			re = session.getMapper(kosta1200.todayroom.mapper.ProductInquiryMapper.class).insertProductInquiry(product_inquiryVO);
			
			if(re>0) {
				session.commit();
			}else {
				session.rollback();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return re;
	}
	
	public List<Product_inquiryVO> listProductInquiry(){
		List<Product_inquiryVO> list = null;
		SqlSession session = getSqlSessionFactory().openSession();
		
		try {
			list = session.getMapper(kosta1200.todayroom.mapper.ProductInquiryMapper.class).listProductInquiry();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		
		return list;
	}
}
