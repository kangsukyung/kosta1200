package kosta1200.todayroom.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import kosta1200.todayroom.vo.CommentsVO;

public interface CommentsMapper {
	
	List<CommentsVO> listComments(RowBounds row);
	
	int insertComments(CommentsVO commentsvo);
	
	int updateComments(CommentsVO commentsvo);
	
	int deleteComments(CommentsVO commentsvo);

	int countComments();
}
