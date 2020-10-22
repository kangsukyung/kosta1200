
package kosta1200.todayroom.vo;

import java.io.Serializable;

public class BoardVO implements Serializable {
	private int board_seq;
	private int member_seq;
	private String board_title;
	private String board_content;
	private String board_date;
	private String board_picture;
	private String board_thumbnail;
	private String board_classification;
	private String board_views;
	private String board_scraps;
	
	public BoardVO() {}

	public BoardVO(int board_seq, int member_seq, String board_title, String board_content, String board_date,
			String board_picture, String board_thumbnail, String board_classification, String board_views,
			String board_scraps) {
		super();
		this.board_seq = board_seq;
		this.member_seq = member_seq;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_date = board_date;
		this.board_picture = board_picture;
		this.board_thumbnail = board_thumbnail;
		this.board_classification = board_classification;
		this.board_views = board_views;
		this.board_scraps = board_scraps;
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

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_date() {
		return board_date;
	}

	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}

	public String getBoard_picture() {
		return board_picture;
	}

	public void setBoard_picture(String board_picture) {
		this.board_picture = board_picture;
	}

	public String getBoard_thumbnail() {
		return board_thumbnail;
	}

	public void setBoard_thumbnail(String board_thumbnail) {
		this.board_thumbnail = board_thumbnail;
	}

	public String getBoard_classification() {
		return board_classification;
	}

	public void setBoard_classification(String board_classification) {
		this.board_classification = board_classification;
	}

	public String getBoard_views() {
		return board_views;
	}

	public void setBoard_views(String board_views) {
		this.board_views = board_views;
	}

	public String getBoard_scraps() {
		return board_scraps;
	}

	public void setBoard_scraps(String board_scraps) {
		this.board_scraps = board_scraps;
	}

	@Override
	public String toString() {
		return "BoardVO [board_seq=" + board_seq + ", member_seq=" + member_seq + ", board_title=" + board_title
				+ ", board_content=" + board_content + ", board_date=" + board_date + ", board_picture=" + board_picture
				+ ", board_thumbnail=" + board_thumbnail + ", board_classification=" + board_classification
				+ ", board_views=" + board_views + ", board_scraps=" + board_scraps + "]";
	}

	

}
