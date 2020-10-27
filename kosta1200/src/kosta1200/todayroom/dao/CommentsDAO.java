package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.CommentsMapper;
import kosta1200.todayroom.vo.CommentsVO;
import kosta1200.todayroom.vo.MemberVO;

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
	
	public List<CommentsVO> listComments(int startRow){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		List<CommentsVO> list = null;
		try {
			list = sqlSession.getMapper(CommentsMapper.class).listComments(new RowBounds(startRow, 3));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}	
	
	public List<MemberVO> listMember(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		List<MemberVO> list = null;
		try {
			list = sqlSession.getMapper(CommentsMapper.class).listMember();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
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
	
	
	public int updateComments(CommentsVO commentsvo) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		System.out.println("어디");
		try {
			re = sqlSession.getMapper(CommentsMapper.class).updateComments(commentsvo);
			System.out.println("re : "+ re);
			if(re > 0) {
				System.out.println("까지");
				sqlSession.commit();
			}else {
				System.out.println("오지");
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return re;
	}

	public int DeleteComments(CommentsVO commentsvo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(CommentsMapper.class).deleteComments(commentsvo);
			System.out.println("re : "+ re);
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
	
	public int countComments(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(CommentsMapper.class).countComments();
			System.out.println("re :: "+ re);
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
