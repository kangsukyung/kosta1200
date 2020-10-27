package kosta1200.todayroom.service;


import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta1200.todayroom.dao.MemberDAO;
import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ContractorVO;
import kosta1200.todayroom.vo.ImageUtil;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.One_inquiryVO;
import kosta1200.todayroom.vo.VendorVO;

public class MemberService {
	private static MemberService service=new MemberService();
	private static MemberDAO dao;
	
	public static MemberService getInstance() {
		dao=MemberDAO.getInstance();
		return service;
	}
	
	
	public int MemberIdCheckList(HttpServletRequest request,HttpServletResponse response){
		String id=request.getParameter("userid");
		return dao.MemberIdCheckList(id);
	}
	
	public int MemberNickNameCheck(HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("userName");
		return dao.MemberNickNameCheck(name);
	}
	public int MemberSignup(HttpServletRequest request,HttpServletResponse response) throws Exception{
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
			
		MemberVO member=new MemberVO();
		member.setMember_address(request.getParameter("memberAddress"));
		member.setMember_email(request.getParameter("memberEmail"));
		member.setMember_id(request.getParameter("memberId"));
		member.setMember_name(request.getParameter("memberName"));
		member.setMember_nickname(request.getParameter("memberNickname"));
		member.setMember_password(request.getParameter("memberPassword"));
		member.setMember_phone(request.getParameter("memberPhone"));
		member.setMember_profile("");
		
		return dao.MemberSignup(member);
	}
	public MemberVO MemberLogin(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		MemberVO member=new MemberVO();
		member.setMember_id(request.getParameter("name"));
		member.setMember_password(request.getParameter("password"));

		return dao.MemberLogin(member);
	}
	
	public MemberVO MemberUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//파일업로드(경로, 파일크기, 인코딩방식, 파일이름 중첩 정책)
		String uploadPath=request.getRealPath("upload");
		System.out.println(uploadPath);
		int size=20*1024*1024;//20MB
		
		MultipartRequest multi= new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());//파일업로드

		MemberVO member=new MemberVO();
		member.setMember_seq(Integer.parseInt(multi.getParameter("seq")));
		member.setMember_address(multi.getParameter("memberAddress"));
		member.setMember_email(multi.getParameter("memberEmail"));
		member.setMember_name(multi.getParameter("memberName"));
		member.setMember_nickname(multi.getParameter("memberNickname"));
		member.setMember_password(multi.getParameter("memberPassword"));
		member.setMember_phone(multi.getParameter("memberPhone"));
		member.setMember_profile("");
		
		//파일업로드 DB(파일 이름 저장)
		if(multi.getFilesystemName("member_profile")!=null) {
			String member_profile=(String)multi.getFilesystemName("member_profile");
			member.setMember_profile(member_profile);
			
			//썸네일 이미지 (gif,jpg) =>aa.gif,aa.jpg
			String pattern =member_profile.substring(member_profile.indexOf(".")+1);//
			System.out.println(pattern);
			String head=member_profile.substring(0,member_profile.indexOf("."));//
			System.out.println(head);
			//원본 File객체
			String imagePath=uploadPath+"\\"+member_profile;
			File src=new File(imagePath);
			
		}
		return dao.MemberUpdate(member);
	}
	
	public int MemberSecession(HttpServletRequest request,HttpServletResponse response ) {
		int seq=Integer.parseInt(request.getParameter("seq"));
		return dao.MemberSecession(seq);
	}
	
	public int ConstractorSignup(HttpServletRequest request,HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		ContractorVO constractor=new ContractorVO();
		constractor.setMember_seq(Integer.parseInt(request.getParameter("seq")));
		constractor.setContractor_address(request.getParameter("memberAddress"));
		constractor.setContractor_bname(request.getParameter("bname"));
		constractor.setContractor_name(request.getParameter("name"));
		
		return dao.ConstractorSignup(constractor);
	}
	
	public int VenderSignup_Action(HttpServletRequest request,HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		VendorVO vender=new VendorVO();
		vender.setVendor_name(request.getParameter("name"));
		vender.setVendor_license(request.getParameter("license"));
		vender.setVendor_introduction(request.getParameter("memberAddress"));
		vender.setVendor_category(request.getParameter("category"));
		vender.setMember_seq(Integer.parseInt(request.getParameter("seq")));
		
		return dao.VendorSignup_Action(vender);
	}
	public int OneInquiry(HttpServletRequest request,HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		One_inquiryVO inquiry=new One_inquiryVO();
		inquiry.setMember_seq(Integer.parseInt(request.getParameter("seq")));
		inquiry.setOi_title(request.getParameter("title"));
		inquiry.setOi_content(request.getParameter("contents"));
		inquiry.setOi_answer("");
		
		return dao.OneInquiry(inquiry);
	}
	
	public List<BoardVO> MyRoomList(int seq) {
		return dao.MyRoomList(seq);
	}
	
	public List<BoardVO> MyKnowhowList(int seq) {
		return dao.MyKnowhowList(seq);
	}
}
