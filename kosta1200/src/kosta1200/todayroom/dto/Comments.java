package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Comments implements Serializable {
	private int comments_seq;
	private String comments_content;
	private String comments_picture;
	
	public Comments(){}

	public Comments(int comments_seq, String comments_content, String comments_picture) {
		super();
		this.comments_seq = comments_seq;
		this.comments_content = comments_content;
		this.comments_picture = comments_picture;
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

	@Override
	public String toString() {
		return "Comments [comments_seq=" + comments_seq + ", comments_content=" + comments_content
				+ ", comments_picture=" + comments_picture + "]";
	}
	
	
}
