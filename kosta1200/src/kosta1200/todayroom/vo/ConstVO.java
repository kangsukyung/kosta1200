package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ConstVO implements Serializable {
	private int const_seq;
	private String const_space;
	private String const_style;
	private String const_color;
	private String const_budget;
	private int member_seq;
	private String const_type;

	public ConstVO() {}

	public ConstVO(int const_seq, String const_space, String const_style, String const_color, String const_budget,
			int member_seq, String const_type) {
		super();
		this.const_seq = const_seq;
		this.const_space = const_space;
		this.const_style = const_style;
		this.const_color = const_color;
		this.const_budget = const_budget;
		this.member_seq = member_seq;
		this.const_type = const_type;
	}

	public int getConst_seq() {
		return const_seq;
	}

	public void setConst_seq(int const_seq) {
		this.const_seq = const_seq;
	}

	public String getConst_space() {
		return const_space;
	}

	public void setConst_space(String const_space) {
		this.const_space = const_space;
	}

	public String getConst_style() {
		return const_style;
	}

	public void setConst_style(String const_style) {
		this.const_style = const_style;
	}

	public String getConst_color() {
		return const_color;
	}

	public void setConst_color(String const_color) {
		this.const_color = const_color;
	}

	public String getConst_budget() {
		return const_budget;
	}

	public void setConst_budget(String const_budget) {
		this.const_budget = const_budget;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public String getConst_type() {
		return const_type;
	}

	public void setConst_type(String const_type) {
		this.const_type = const_type;
	}

	@Override
	public String toString() {
		return "ConstVO [const_seq=" + const_seq + ", const_space=" + const_space + ", const_style=" + const_style
				+ ", const_color=" + const_color + ", const_budget=" + const_budget + ", member_seq=" + member_seq
				+ ", const_type=" + const_type + "]";
	}

}
