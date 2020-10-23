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
	
	
	
	public int insertComments(CommentsVO commentsvo){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(CommentsMapper.class).insertComments(commentsvo);
			if(re > 0){
				sqlSession.commit();//들어온 값이 있으면 커밋
			}else{
				sqlSession.rollback();//들어온 값이 없으면 롤백
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return re;
	}
	
	
	
	
	
	public List<CommentsVO> listComments(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		List<CommentsVO> list = null;
		try {
			list = sqlSession.getMapper(CommentsMapper.class).listComments();
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
