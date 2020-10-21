package kosta1200.todayroom.service;

import java.io.File;


import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.core.ApplicationPart;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.BoardDAO;
import kosta1200.todayroom.dao.StoreDAO;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ImageUtil;
import kosta1200.todayroom.vo.RoomwarmingVO;

public class BoardService {
	private static BoardService service = new BoardService();
	private static BoardDAO dao;
	
	public static BoardService getInstance() {
		dao = BoardDAO.getInstance();
		return service;
	}
	
	public int insertBoardService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		
		//파일업로드(경로가 어디냐, 파일크기가 어느정도냐, 인코딩방식, 파일이름이 중첩되었을 때 정책)
		String uploadPath = request.getRealPath("upload");
		int size = 20 * 1024 * 1024;//20MB

		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, 
				"utf-8", new DefaultFileRenamePolicy());
		
		BoardVO board = new BoardVO();
		RoomwarmingVO room = new RoomwarmingVO();
		
		board.setBoard_classification(multi.getParameter("select_option"));
//		room.setRoomwarming_type(multi.getParameter("room_select"));
//		room.setRoomwarming_classification(multi.getParameter("classification"));
//		room.setRoomwarming_space(multi.getParameter("space"));
//		room.setRoomwarming_style(multi.getParameter("style"));
//		room.setRoomwarming_color(multi.getParameter("color"));
//		room.setRoomwarming_budget(multi.getParameter("budget"));
		
		
		board.setBoard_classification(multi.getParameter("classification"));
		board.setBoard_title(multi.getParameter("title"));
		board.setBoard_content(multi.getParameter("content"));
		board.setBoard_thumbnail(multi.getParameter("thumbnail_image"));
		board.setBoard_picture("");
		
		//파일 업로드 DB(파일이름 저장) 
		if (multi.getFilesystemName("thumbnail_image") != null) {//파일이 업로드 되었을 때 이름을 알려주는 메소드
			String fname = (String)multi.getFilesystemName("thumbnail_image");//object를 리턴하기 때문에 string으로 형변환해쥼
			board.setBoard_thumbnail(fname);
			
			//썸네일 이미지(gif, jpg, png) => aa.gif, aa.jpg, aa.png
			//"." + 1 : 점 이후에 있는 글자/ "." : 점 까지
			String pattern = fname.substring(fname.indexOf(".") + 1);//gif, jpg, png
			String head = fname.substring(0, fname.indexOf("."));//aa
			
			//원본 File객체
			String imagePath = uploadPath + "\\" + fname;
			File src = new File(imagePath);
			
			//썸네일 File객체
			String thumPath = uploadPath + "\\" + head + "_small." + pattern;
			File dest = new File(thumPath);
			
			if (pattern.equals("gif") || pattern.equals("jpg") || pattern.equals("png")) {
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);
			}
			
		}
		
		return dao.insertBoard(board);
	}
	
}
