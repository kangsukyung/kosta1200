package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Comments implements Serializable {
	private int comments_seq;
	private String comments_content;
	private String comments_picture;
	private int board_seq;
	private int member_seq;
	private int admin_seq;
	
	public Comments() {}

	public Comments(int comments_seq, String comments_content, String comments_picture, int board_seq, int member_seq,
			int admin_seq) {
		super();
		this.comments_seq = comments_seq;
		this.comments_content = comments_content;
		this.comments_picture = comments_picture;
		this.board_seq = board_seq;
		this.member_seq = member_seq;
		this.admin_seq = admin_seq;
	}

	public int getComments_seq() {
		return comments_seq;
	}

	public void setComments_seq(int comments_seq) {
		this.comments_seq = comments_seq;
	}

	public String getComments_content() {
		return comments_content;
	}

	public void setComments_content(String comments_content) {
		this.comments_content = comments_content;
	}

	public String getComments_picture() {
		return comments_picture;
	}

	public void setComments_picture(String comments_picture) {
		this.comments_picture = comments_picture;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
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
		return "Comments [comments_seq=" + comments_seq + ", comments_content=" + comments_content
				+ ", comments_picture=" + comments_picture + ", board_seq=" + board_seq + ", member_seq=" + member_seq
				+ ", admin_seq=" + admin_seq + "]";
	}
	
	
	
	
	
}
