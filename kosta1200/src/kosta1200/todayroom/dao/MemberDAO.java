package kosta1200.todayroom.dao;

import java.io.InputStream;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.MemberMapper;
import kosta1200.todayroom.vo.MemberVO;



public class MemberDAO {
	private static MemberDAO dao=new MemberDAO();
	
	public static MemberDAO getInstance() {
		return dao;
	}
	public SqlSessionFactory getSqlSessionFactory() {
		String resource="mybatis-config.xml";
		InputStream in=null;
		
		try {
			in=Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);//getxml팩토리를 구함
	}
	
	public int MemberIdCheckList(String id) {
	int checkid=-1;
	SqlSession sqlSession=getSqlSessionFactory().openSession();
	
	try {
		MemberVO member=null;
		member=sqlSession.getMapper(MemberMapper.class).MemberIdCheckList(id);
		if(member!=null) {
			checkid=1;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(sqlSession!= null) {
			sqlSession.close();
		}
	}
	return checkid;
	}
	
	public int MemberNickNameCheck(String name) {
	int checkname=-1;
	SqlSession sqlSession=getSqlSessionFactory().openSession();
	
	try {
		MemberVO member=null;
		member=sqlSession.getMapper(MemberMapper.class).MemberNickNameCheck(name);
		if(member!=null) {
			checkname=1;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(sqlSession!= null) {
			sqlSession.close();
		}
	}
	return checkname;
	}
	public int MemberSignup(MemberVO member) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		
		try {
			re=sqlSession.getMapper(MemberMapper.class).MemberSignup(member);
			if(re>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!= null) {
				sqlSession.close();
			}
		}
		return re;
	}
	
	public MemberVO MemberLogin(MemberVO member) {
		MemberVO membervo=null;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		try {
			membervo=sqlSession.getMapper(MemberMapper.class).MemberLogin(member);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!= null) {
				sqlSession.close();
			}
		}
		return membervo;
	}
	public MemberVO MemberUpdate(MemberVO member) {
		MemberVO membervo=null;
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		
		try {
			re=sqlSession.getMapper(MemberMapper.class).MemberUpdate(member);
			if(re>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
			membervo=sqlSession.getMapper(MemberMapper.class).MemberUpdate_select(member);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!= null) {
				sqlSession.close();
			}
		}
		return membervo;
	}
	
	public int MemberSecession(int seq) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		
		try {
			re=sqlSession.getMapper(MemberMapper.class).MemberSecession(seq);
			if(re>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!= null) {
				sqlSession.close();
			}
		}
		return re;
	}

	
}
