package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ScrapVO implements Serializable {
	private int scrap_seq;
	private int member_seq;
	private int board_seq;
	
	public ScrapVO() {}

	public ScrapVO(int scrap_seq, int member_seq, int board_seq) {
		super();
		this.scrap_seq = scrap_seq;
		this.member_seq = member_seq;
		this.board_seq = board_seq;
	}

	public int getScrap_seq() {
		return scrap_seq;
	}

	public void setScrap_seq(int scrap_seq) {
		this.scrap_seq = scrap_seq;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	@Override
	public String toString() {
		return "Scrap [scrap_seq=" + scrap_seq + ", member_seq=" + member_seq + ", board_seq=" + board_seq + "]";
	}
	
	

}
