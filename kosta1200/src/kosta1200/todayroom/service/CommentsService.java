package kosta1200.todayroom.service;

import java.util.List;

import kosta1200.todayroom.dao.CommentsDAO;
import kosta1200.todayroom.vo.CommentsVO;

public class CommentsService {
	private static CommentsService service = new CommentsService();
	private static CommentsDAO dao;
	
	public static CommentsService getInstance(){
		dao = CommentsDAO.getInstance();
		return service;
	}
	
	public List<CommentsVO> listCommentsService()throws Exception{
		return dao.listComments();
	}
}
