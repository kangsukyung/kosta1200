package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.CommentsMapper;
import kosta1200.todayroom.vo.CommentsVO;

public class CommentsDAO {
	private static CommentsDAO dao = new CommentsDAO();
	
	public static CommentsDAO getInstance(){
		return dao;
	}
	
	//mybatis sqlSessionFactory를 쓸 수 있게 만들어줌
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	
	
	public List<CommentsVO> listComments(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		List<CommentsVO> list = null;
		try {
			list = sqlSession.getMapper(CommentsMapper.class).listComments();
			System.out.println("dao에 list잘 오나 : "+list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}
}
