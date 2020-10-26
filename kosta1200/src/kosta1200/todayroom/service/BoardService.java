package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.BoardDAO;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ImageUtil;
import kosta1200.todayroom.vo.KnowhowVO;
import kosta1200.todayroom.vo.MemberVO;
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
		System.out.println(uploadPath);
		int size = 20 * 1024 * 1024;//20MB
				
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, 
				"utf-8", new DefaultFileRenamePolicy());
		
		BoardVO board = new BoardVO();
		board.setBoard_title(multi.getParameter("title"));
		board.setBoard_content(multi.getParameter("content"));
		//date
		board.setBoard_picture("aa");
		board.setBoard_thumbnail("thumbnail_image");
		board.setBoard_classification(multi.getParameter("classification"));
		System.out.println(multi.getParameter("classification"));
		
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
			System.out.println(imagePath);
			
			//썸네일 File객체
			String thumPath = uploadPath + "\\" + head + "_small." + pattern;
			File dest = new File(thumPath);
			System.out.println(thumPath);
			
			if (pattern.equals("gif") || pattern.equals("jpg") || pattern.equals("png")) {
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);
			}
			
		}
		int result1 = dao.insertBoard(board);

		int result2 = -1;
		if (multi.getParameter("roomwarming_classification") != null) {
			RoomwarmingVO room = new RoomwarmingVO();
			room.setRoomwarming_type(multi.getParameter("roomwarming_type"));//공간		
			room.setRoomwarming_classification(multi.getParameter("roomwarming_classification"));//분류=작업
			room.setRoomwarming_space(multi.getParameter("roomwarming_space")+"평");//평수
			room.setRoomwarming_style(multi.getParameter("roomwarming_style"));//스타일
			room.setRoomwarming_color(multi.getParameter("roomwarming_color"));//컬러
			room.setRoomwarming_budget(multi.getParameter("roomwarming_budget")+"만원");//예산
			
			result2 = dao.insertRoomwarming(room);
		}
		
		int result3 = -1;
		if (multi.getParameter("knowhow_style") != null) {
			KnowhowVO knowhow = new KnowhowVO();
			knowhow.setKnowhow_style(multi.getParameter("knowhow_style"));
			
			result3 = dao.insertKnowhow(knowhow);
		}
		
		if(result1 > 0 || result2 > 0 || result3 > 0) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	public List<BoardVO> listBoardService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		
		return dao.listBoard("%"+request.getParameter("keyword")+"%");
	}
	
	public List<RoomwarmingVO> listRoomwarmingService()throws Exception{
		return dao.listRoomwarming();
	}
	
	public List<KnowhowVO> listKnowhowService()throws Exception {
		return dao.listKnowhow();
	}
	
	public List<MemberVO> ListMemberService()throws Exception {
		return dao.ListMember();
	}
	
	public BoardVO listDetailBoardService(int seq)throws Exception{
		return dao.listDetailBoard(seq);
	}
	
	public MemberVO listDetailMemberService(int seq)throws Exception{
		return dao.listDetailMember(seq);
	}
	
	public RoomwarmingVO DetailRoomwarmingService(int seq)throws Exception{
		return dao.DetailRoomwarming(seq);
	}
	
	public KnowhowVO DetailKnowhowService(int seq)throws Exception{
		return dao.DetailKnowhow(seq);
	}
}
