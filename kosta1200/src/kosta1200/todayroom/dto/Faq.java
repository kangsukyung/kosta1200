package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Faq implements Serializable {
	private int faq_seq;
	private String faq_classification;
	private String faq_title;
	private String faq_content;
	private int admin_seq;
	
	public Faq() {}

	public Faq(int faq_seq, String faq_classification, String faq_title, String faq_content, int admin_seq) {
		super();
		this.faq_seq = faq_seq;
		this.faq_classification = faq_classification;
		this.faq_title = faq_title;
		this.faq_content = faq_content;
		this.admin_seq = admin_seq;
	}

	public int getFaq_seq() {
		return faq_seq;
	}

	public void setFaq_seq(int faq_seq) {
		this.faq_seq = faq_seq;
	}

	public String getFaq_classification() {
		return faq_classification;
	}

	public void setFaq_classification(String faq_classification) {
		this.faq_classification = faq_classification;
	}

	public String getFaq_title() {
		return faq_title;
	}

	public void setFaq_title(String faq_title) {
		this.faq_title = faq_title;
	}

	public String getFaq_content() {
		return faq_content;
	}

	public void setFaq_content(String faq_content) {
		this.faq_content = faq_content;
	}

	public int getAdmin_seq() {
		return admin_seq;
	}

	public void setAdmin_seq(int admin_seq) {
		this.admin_seq = admin_seq;
	}

	@Override
	public String toString() {
		return "Faq [faq_seq=" + faq_seq + ", faq_classification=" + faq_classification + ", faq_title=" + faq_title
				+ ", faq_content=" + faq_content + ", admin_seq=" + admin_seq + "]";
	}
	
	

	
	

}
