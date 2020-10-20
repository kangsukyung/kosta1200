package kosta1200.todayroom.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.MemberDAO;

public class MemberService {
	private static MemberService service=new MemberService();
	private static MemberDAO dao;
	private static final int PAGE_SIZE=2;
	
	public static MemberService getInstance() {
		dao=MemberDAO.getInstance();
		return service;
	}
	
	public int insertBoardService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		
		//파일업로드(경로, 파일크기, 인코딩방식, 파일이름 중첩 정책)
		String uploadPath=request.getRealPath("upload");
		int size=20*1024*1024;//20MB
		
		MultipartRequest multi= new MultipartRequest(
				request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());//파일업로드
		
		Board board=new Board();
		board.setTitle(multi.getParameter("title"));
		board.setWriter(multi.getParameter("writer"));
		board.setContents(multi.getParameter("contents"));
		board.setFname("");
		
		//파일업로드 DB(파일 이름 저장)
		
		if(multi.getFilesystemName("fname")!=null) {
			String fname=(String)multi.getFilesystemName("fname");
			board.setFname(fname);
			
			//썸네일 이미지 (gif,jpg) =>aa.gif,aa.jpg
			String pattern =fname.substring(fname.indexOf(".")+1);//gif
			String head=fname.substring(0,fname.indexOf("."));//aa
			
			//원본 File객체
			String imagePath=uploadPath+"\\"+fname;
			File src=new File(imagePath);
			
			//썸네일 File객체
			String thumPath=uploadPath+ "\\"+head+"_small."+pattern;
			File dest=new File(thumPath);
			
			if(pattern.equals("gif")||pattern.equals("jpg")) {
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);
			}
		}
		
		return dao.insertBoard(board);
	}
	
	public ListModel listBoardService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		Search search=new Search();
		HttpSession session=request.getSession();
		
		//검색할 경우
		if(request.getParameterValues("searchKey")!=null) {
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey("%"+request.getParameter("searchKey")+"%");
			session.setAttribute("search", search);
		}else if(session.getAttribute("search")!=null){//검색 후 페이지를 클릭할 경우
			search=(Search)session.getAttribute("search");
		}
		
		//페이징 처리
		//페이지당 글갯수=PAGE_SIZE, 총 글갯수=totalCount, 총 페이지수=totalPageCount, 현재 페이지=requestPage
		
		//총글갯수
		int totalCount=dao.countBoard(search);
		
		System.out.println("총글갯수"+totalCount);
		
		//총페이지 수
		int totalPageCount=totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE>0) {
			totalPageCount++;
		}
		//현재페이지
		String pageNum=request.getParameter("pageNum");
		if(pageNum == null) {
			pageNum="1";
		}
		int requestPage=Integer.parseInt(pageNum);
		System.out.println("현재페이지"+requestPage);
		
		//startPage
		//startPage=현재페이지 - (현재페이지-1) %5=8
		int startPage=requestPage-(requestPage-1)%5;
		
		System.out.println("스타트페이지"+startPage);
		//endPage
		int endPage=startPage+4;
		if(endPage > totalPageCount) {
			endPage=totalPageCount;
		}
		System.out.println("엔드페이지"+endPage);
	
		//startRow = (현재페이지-1)*페이지당 글갯수
		int startRow=(requestPage-1)*PAGE_SIZE;
		
		List<Board> list=dao.listBoard(search,startRow);
		
		ListModel listModel=
				new ListModel(list, requestPage, totalPageCount, startPage, endPage);
		
		return listModel;
	}
	
	public Board detaiBoardService(int seq)throws Exception{
		Board board=dao.detaillBoard(seq);
		return board;
	}
	
	public int deleteBoard(int seq)throws Exception{
		return dao.deleteBoard(seq);
	}
	public int updateBoardService(Board board)throws Exception{
		return dao.updateBoard(board);
	}
	
	public int insertReplyService(Reply reply)throws Exception{
		return dao.insertReply(reply);
	}

	public List<Reply> listReplyService(int seq)throws Exception{
		return dao.listReply(seq);
	}
	
}