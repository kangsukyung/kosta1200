package kosta1200.todayroom.vo;

import java.io.Serializable;

public class Product_inquiryVO implements Serializable {
	private int pi_seq;
	private String pi_type;
	private String pi_content;
	private String pi_answer;
	private int product_seq;
	private int member_seq;
	
	public Product_inquiryVO() {}

	public Product_inquiryVO(int pi_seq, String pi_type, String pi_content, String pi_answer, int product_seq,
			int member_seq) {
		super();
		this.pi_seq = pi_seq;
		this.pi_type = pi_type;
		this.pi_content = pi_content;
		this.pi_answer = pi_answer;
		this.product_seq = product_seq;
		this.member_seq = member_seq;
	}

	public int getPi_seq() {
		return pi_seq;
	}

	public void setPi_seq(int pi_seq) {
		this.pi_seq = pi_seq;
	}

	public String getPi_type() {
		return pi_type;
	}

	public void setPi_type(String pi_type) {
		this.pi_type = pi_type;
	}

	public String getPi_content() {
		return pi_content;
	}

	public void setPi_content(String pi_content) {
		this.pi_content = pi_content;
	}

	public String getPi_answer() {
		return pi_answer;
	}

	public void setPi_answer(String pi_answer) {
		this.pi_answer = pi_answer;
	}

	public int getProduct_seq() {
		return product_seq;
	}

	public void setProduct_seq(int product_seq) {
		this.product_seq = product_seq;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	@Override
	public String toString() {
		return "Product_inquiry [pi_seq=" + pi_seq + ", pi_type=" + pi_type + ", pi_content=" + pi_content
				+ ", pi_answer=" + pi_answer + ", product_seq=" + product_seq + ", member_seq=" + member_seq + "]";
	}
	
	
}
