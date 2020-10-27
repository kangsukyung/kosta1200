package kosta1200.todayroom.mapper;

import java.util.List;

import kosta1200.todayroom.vo.BoardVO;
import kosta1200.todayroom.vo.ContractorVO;
import kosta1200.todayroom.vo.MemberVO;
import kosta1200.todayroom.vo.One_inquiryVO;
import kosta1200.todayroom.vo.VendorVO;

public interface MemberMapper {
	MemberVO MemberIdCheckList(String id);
	MemberVO MemberNickNameCheck(String name);
	int MemberSignup(MemberVO member);
	MemberVO MemberLogin(MemberVO member);
	int MemberUpdate(MemberVO member);
	MemberVO MemberUpdate_select(MemberVO member);
	int MemberSecession(int seq);
	int ConstractorSignup(ContractorVO constractor);
	int Constractor_Rating(int seq);
	int VendorSignup(VendorVO vendor);
	int Vender_Rating(int seq);
	int OneInquiry(One_inquiryVO inquiry);
	List<BoardVO> MyRoomList(int seq);
	List<BoardVO> MyKnowhowList(int seq);
}
