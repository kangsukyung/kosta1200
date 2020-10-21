package kosta1200.todayroom.vo;

import java.io.Serializable;

public class One_inquiryVO implements Serializable {
	private int oi_seq;
	private String oi_title;
	private String oi_content;
	private String oi_answer;
	private int member_seq;
	private int admin_seq;
	
	public One_inquiryVO() {}

	public One_inquiryVO(int oi_seq, String oi_title, String oi_content, String oi_answer, int member_seq,
			int admin_seq) {
		super();
		this.oi_seq = oi_seq;
		this.oi_title = oi_title;
		this.oi_content = oi_content;
		this.oi_answer = oi_answer;
		this.member_seq = member_seq;
		this.admin_seq = admin_seq;
	}

	public int getOi_seq() {
		return oi_seq;
	}

	public void setOi_seq(int oi_seq) {
		this.oi_seq = oi_seq;
	}

	public String getOi_title() {
		return oi_title;
	}

	public void setOi_title(String oi_title) {
		this.oi_title = oi_title;
	}

	public String getOi_content() {
		return oi_content;
	}

	public void setOi_content(String oi_content) {
		this.oi_content = oi_content;
	}

	public String getOi_answer() {
		return oi_answer;
	}

	public void setOi_answer(String oi_answer) {
		this.oi_answer = oi_answer;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public int getAdmin_seq() {
		return admin_seq;
	}

	public void setAdmin_seq(int admin_seq) {
		this.admin_seq = admin_seq;
	}

	@Override
	public String toString() {
		return "One_inquiry [oi_seq=" + oi_seq + ", oi_title=" + oi_title + ", oi_content=" + oi_content
				+ ", oi_answer=" + oi_answer + ", member_seq=" + member_seq + ", admin_seq=" + admin_seq + "]";
	}
	
	
	
	
}
