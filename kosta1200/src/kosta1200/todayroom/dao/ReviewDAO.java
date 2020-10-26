package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.CommentsMapper;
import kosta1200.todayroom.mapper.ReviewMapper;
import kosta1200.todayroom.vo.CommentsVO;
import kosta1200.todayroom.vo.ReviewVO;

public class ReviewDAO {
private static ReviewDAO dao = new ReviewDAO();
	
	public static ReviewDAO getInstance(){
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
	
	//insert
	public int insertReview(ReviewVO reviewvo){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(ReviewMapper.class).insertReview(reviewvo);
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
	
	//list
	public List<ReviewVO> listReview(int startRow) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		List<ReviewVO> list = null;
		try {
			list = sqlSession.getMapper(ReviewMapper.class).listReview(new RowBounds(startRow, 3));
			System.out.println("dao에서 list : "+list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		return list;
	}
	
	//update
	public int updateReview(ReviewVO reviewvo) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		System.out.println("어디");
		try {
			re = sqlSession.getMapper(ReviewMapper.class).updateReview(reviewvo);
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
	
	//delete
	public int DeleteReview(ReviewVO reviewvo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(ReviewMapper.class).deleteReview(reviewvo);
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
	
	
	public int countReview(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		try {
			re = sqlSession.getMapper(ReviewMapper.class).countReview();
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
