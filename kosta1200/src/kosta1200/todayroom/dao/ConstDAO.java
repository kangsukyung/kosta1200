package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.vo.ConstVO;

public class ConstDAO {
	private static ConstDAO dao = new ConstDAO();
	public static ConstDAO getInstance() {
		return dao;
	}	//½Ì±ÛÅæ ¹æ½Ä ¼³Á¤
	
	public SqlSessionFactory getSqlSessionFactory() {
		String resource="mybatis-config.xml";
		InputStream in = null;
		
		try {
			in=Resources.getResourceAsStream(resource);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public int insertConst(ConstVO constVO) {
		int re = -1;
		SqlSession session = getSqlSessionFactory().openSession();
		
		try {
			re = session.getMapper(kosta1200.todayroom.mapper.ConstMapper.class).insertConst(constVO);
			
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
	
	public List<ConstVO> listConst(){
		List<ConstVO> list = null;
		
		SqlSession session = getSqlSessionFactory().openSession();
		
		try {
			list = session.getMapper(kosta1200.todayroom.mapper.ConstMapper.class).listConst();
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
