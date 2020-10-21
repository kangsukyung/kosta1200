package kosta1200.todayroom.vo;

import java.io.Serializable;

public class MemberVO implements Serializable {
	private int member_seq;
	private String member_id;
	private String member_nickname;
	private String member_name;
	private String member_address;
	private String member_phone;
	private String member_email;
	private String member_rating;
	private String member_password;
	private String member_follows;
	private String member_profile;

	public MemberVO() {
	}

	public MemberVO(int member_seq, String member_id, String member_nickname, String member_name, String member_address,
			String member_phone, String member_email, String member_rating, String member_password,
			String member_follows, String member_profile) {
		super();
		this.member_seq = member_seq;
		this.member_id = member_id;
		this.member_nickname = member_nickname;
		this.member_name = member_name;
		this.member_address = member_address;
		this.member_phone = member_phone;
		this.member_email = member_email;
		this.member_rating = member_rating;
		this.member_password = member_password;
		this.member_follows = member_follows;
		this.member_profile = member_profile;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_nickname() {
		return member_nickname;
	}

	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_address() {
		return member_address;
	}

	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}

	public String getMember_phone() {
		return member_phone;
	}

	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_rating() {
		return member_rating;
	}

	public void setMember_rating(String member_rating) {
		this.member_rating = member_rating;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getMember_follows() {
		return member_follows;
	}

	public void setMember_follows(String member_follows) {
		this.member_follows = member_follows;
	}

	public String getMember_profile() {
		return member_profile;
	}

	public void setMember_profile(String member_profile) {
		this.member_profile = member_profile;
	}

	@Override
	public String toString() {
		return "MemberVO [member_seq=" + member_seq + ", member_id=" + member_id + ", member_nickname="
				+ member_nickname + ", member_name=" + member_name + ", member_address=" + member_address
				+ ", member_phone=" + member_phone + ", member_email=" + member_email + ", member_rating="
				+ member_rating + ", member_password=" + member_password + ", member_follows=" + member_follows
				+ ", member_profile=" + member_profile + "]";
	}
}
