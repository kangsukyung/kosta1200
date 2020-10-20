package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Knowhow implements Serializable {
	private int board_seq;
	private String knowhow_style;
	
	public Knowhow() {}

	public Knowhow(int board_seq, String knowhow_style) {
		super();
		this.board_seq = board_seq;
		this.knowhow_style = knowhow_style;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public String getKnowhow_style() {
		return knowhow_style;
	}

	public void setKnowhow_style(String knowhow_style) {
		this.knowhow_style = knowhow_style;
	}

	@Override
	public String toString() {
		return "Knowhow [board_seq=" + board_seq + ", knowhow_style=" + knowhow_style + "]";
	}
	
	

}
