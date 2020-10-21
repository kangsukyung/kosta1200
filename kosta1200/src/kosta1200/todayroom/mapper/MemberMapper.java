package kosta1200.todayroom.mapper;

import kosta1200.todayroom.vo.MemberVO;

public interface MemberMapper {
	MemberVO MemberIdCheckList(String id);
	MemberVO MemberNickNameCheck(String name);
	int MemberSignup(MemberVO member);
	MemberVO MemberLogin(MemberVO member);
}