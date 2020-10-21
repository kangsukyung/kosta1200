package kosta1200.todayroom.dao;

import java.io.InputStream;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.mapper.MemberMapper;



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
	System.out.println("1");
	int re=-1;
	SqlSession sqlSession=getSqlSessionFactory().openSession();
	
	try {
		re=sqlSession.getMapper(MemberMapper.class).MemberIdCheckList(id);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(sqlSession!= null) {
			sqlSession.close();
		}
	}
	System.out.println(re);
	return re;
	}
	
	
}
