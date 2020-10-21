package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ReportVO implements Serializable {
	private int report_seq;
	private String report_reason;
	private int member_seq;
	private int board_seq;
	private int comments_seq;
	
	public ReportVO() {}

	public ReportVO(int report_seq, String report_reason, int member_seq, int board_seq, int comments_seq) {
		super();
		this.report_seq = report_seq;
		this.report_reason = report_reason;
		this.member_seq = member_seq;
		this.board_seq = board_seq;
		this.comments_seq = comments_seq;
	}

	public int getReport_seq() {
		return report_seq;
	}

	public void setReport_seq(int report_seq) {
		this.report_seq = report_seq;
	}

	public String getReport_reason() {
		return report_reason;
	}

	public void setReport_reason(String report_reason) {
		this.report_reason = report_reason;
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

	public int getComments_seq() {
		return comments_seq;
	}

	public void setComments_seq(int comments_seq) {
		this.comments_seq = comments_seq;
	}

	@Override
	public String toString() {
		return "Report [report_seq=" + report_seq + ", report_reason=" + report_reason + ", member_seq=" + member_seq
				+ ", board_seq=" + board_seq + ", comments_seq=" + comments_seq + "]";
	}
	
	

}
