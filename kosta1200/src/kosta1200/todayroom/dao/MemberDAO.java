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
<<<<<<< HEAD
=======
	
	public int deleteBoard(int seq) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		
		try {
			re=sqlSession.getMapper(BoardMapper.class).deleteBoard(seq);
			if(re>0) {
				sqlSession.commit();//而ㅻ컠�쓣 諛섎뱶�떆 �빐以섏빞 �뜲�씠�꽣媛� �뱾�뼱媛�
			}else {
				sqlSession.rollback();//�뱾�뼱媛�吏� �븡�쑝硫� 濡ㅻ갚
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
	
	public int updateBoard(BoardVO board) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql�꽭�뀡�쓣 援ы븷�닔�엳�떎
		try {
			re=sqlSession.getMapper(BoardMapper.class).updateBoard(board);
			if(re>0) {
				sqlSession.commit();//而ㅻ컠�쓣 諛섎뱶�떆 �빐以섏빞 �뜲�씠�꽣媛� �뱾�뼱媛�
			}else {
				sqlSession.rollback();//�뱾�뼱媛�吏� �븡�쑝硫� 濡ㅻ갚
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
	
	public int insertBoard(BoardVO board) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql�꽭�뀡�쓣 援ы븷�닔�엳�떎
		try {
			re=sqlSession.getMapper(BoardMapper.class).insertBoard(board);
			if(re>0) {
				sqlSession.commit();//而ㅻ컠�쓣 諛섎뱶�떆 �빐以섏빞 �뜲�씠�꽣媛� �뱾�뼱媛�
			}else {
				sqlSession.rollback();//�뱾�뼱媛�吏� �븡�쑝硫� 濡ㅻ갚
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
	
>>>>>>> refs/heads/develop
	public SqlSessionFactory getSqlSessionFactory() {
		String resource="mybatis-config.xml";
		InputStream in=null;
		
		try {
			in=Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);//getxml�뙥�넗由щ�� 援ы븿
	}
	
<<<<<<< HEAD
	public int MemberIdCheckList(String id) {
	System.out.println("1");
	int re=-1;
	SqlSession sqlSession=getSqlSessionFactory().openSession();
=======
	public BoardVO detaillBoard(int seq) {
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql�꽭�뀡�쓣 援ы븷�닔�엳�떎
		BoardVO board=null;

		try {
			board=sqlSession.getMapper(BoardMapper.class).detaillBoard(seq);
//			board=sqlSession.selectOne("kosta.mapper.BoardMapper.detaillBoard",seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!= null) {
				sqlSession.close();
			}
		}
		return board;
	}
>>>>>>> refs/heads/develop
	
<<<<<<< HEAD
	try {
		re=sqlSession.getMapper(MemberMapper.class).MemberIdCheckList(id);
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		if(sqlSession!= null) {
=======
	public List<BoardVO> listBoard(Search search, int startRow){
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql�꽭�뀡�쓣 援ы븷�닔�엳�떎
		List<BoardVO> list=null;
		
		try {
			list=sqlSession.getMapper(BoardMapper.class).listBoard(search, new RowBounds(startRow, 2));
//			list=sqlSession.selectList("kosta.mapper.BoardMapper.listBoard");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!= null) {
				sqlSession.close();
			}
		}
		return list;
	}
	
	public int insertReply(Reply reply) {
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql�꽭�뀡�쓣 援ы븷�닔�엳�떎
		int re=-1;

		try {
			re=sqlSession.getMapper(BoardMapper.class).insertReply(reply);
			if(re>0) {
				sqlSession.commit();//而ㅻ컠�쓣 諛섎뱶�떆 �빐以섏빞 �뜲�씠�꽣媛� �뱾�뼱媛�
			}else {
				sqlSession.rollback();//�뱾�뼱媛�吏� �븡�쑝硫� 濡ㅻ갚
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
>>>>>>> refs/heads/develop
			sqlSession.close();
		}
	}
	System.out.println(re);
	return re;
	}
	
	
}
