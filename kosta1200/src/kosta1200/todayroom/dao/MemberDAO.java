package kosta1200.todayroom.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta1200.todayroom.action.ConstractorSignup_Action;
import kosta1200.todayroom.mapper.MemberMapper;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ContractorVO;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.One_inquiryVO;
import kosta1200.todayroom.vo.VendorVO;



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
	
	public int ConstractorSignup(ContractorVO constractor) {
		int re=-1;
		int re1=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		int seq=constractor.getMember_seq();
		try {
			re=sqlSession.getMapper(MemberMapper.class).ConstractorSignup(constractor);
			re1=sqlSession.getMapper(MemberMapper.class).Constractor_Rating(seq);
			if(re>0 && re1>0) {
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
	
	public int VendorSignup_Action(VendorVO vendor) {
		int re=-1;
		int re1=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		int seq=vendor.getMember_seq();
		try {
			re=sqlSession.getMapper(MemberMapper.class).VendorSignup(vendor);
			re1=sqlSession.getMapper(MemberMapper.class).Vender_Rating(seq);
			
			if(re>0 && re1>0) {
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
	
	public int OneInquiry(One_inquiryVO inquiry) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		try {
			re=sqlSession.getMapper(MemberMapper.class).OneInquiry(inquiry);
			
			System.out.println(re);
			if(re>0 ) {
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
	
	public List<BoardVO> MyRoomList(int seq) {
		List<BoardVO> board=null;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		try {
			board=sqlSession.getMapper(MemberMapper.class).MyRoomList(seq);
			if(board!=null ) {
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
		return board;
	}

	public List<BoardVO> MyKnowhowList(int seq) {
		List<BoardVO> board=null;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		try {
			board=sqlSession.getMapper(MemberMapper.class).MyKnowhowList(seq);
			if(board!=null ) {
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
		return board;
	}
}
