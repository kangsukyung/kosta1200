package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.CommentsVO;

public interface CommentsMapper {
	
	List<CommentsVO> listComments();
	
	int insertComments(CommentsVO commentsvo);
	
	int updateComments(CommentsVO commentsvo);
}
