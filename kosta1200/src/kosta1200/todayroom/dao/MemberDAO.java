package kosta1200.todayroom.dao;

import java.io.InputStream;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MemberDAO {
	private static MemberDAO dao=new MemberDAO();
	
	public static MemberDAO getInstance() {
		return dao;
	}
	
	public int deleteBoard(int seq) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		
		try {
			re=sqlSession.getMapper(BoardMapper.class).deleteBoard(seq);
			if(re>0) {
				sqlSession.commit();//커밋을 반드시 해줘야 데이터가 들어감
			}else {
				sqlSession.rollback();//들어가지 않으면 롤백
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
	
	public int updateBoard(Board board) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql세션을 구할수있다
		try {
			re=sqlSession.getMapper(BoardMapper.class).updateBoard(board);
			if(re>0) {
				sqlSession.commit();//커밋을 반드시 해줘야 데이터가 들어감
			}else {
				sqlSession.rollback();//들어가지 않으면 롤백
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
	
	public int insertBoard(Board board) {
		int re=-1;
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql세션을 구할수있다
		try {
			re=sqlSession.getMapper(BoardMapper.class).insertBoard(board);
			if(re>0) {
				sqlSession.commit();//커밋을 반드시 해줘야 데이터가 들어감
			}else {
				sqlSession.rollback();//들어가지 않으면 롤백
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
	
	public Board detaillBoard(int seq) {
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql세션을 구할수있다
		Board board=null;

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
	
	public List<Board> listBoard(Search search, int startRow){
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql세션을 구할수있다
		List<Board> list=null;
		
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
		SqlSession sqlSession=getSqlSessionFactory().openSession();//sql세션을 구할수있다
		int re=-1;

		try {
			re=sqlSession.getMapper(BoardMapper.class).insertReply(reply);
			if(re>0) {
				sqlSession.commit();//커밋을 반드시 해줘야 데이터가 들어감
			}else {
				sqlSession.rollback();//들어가지 않으면 롤백
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return re;
	}
	
	public List<Reply> listReply(int seq){
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		List<Reply> list=null;
		
		try {
			list=sqlSession.getMapper(BoardMapper.class).listReply(seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	
	public int countBoard(Search search) {
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		int re=0;
		
		try {
			re=sqlSession.getMapper(BoardMapper.class).countBoard(search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession!=null){
			sqlSession.close();
			}
		}
		return re;
	}
}
