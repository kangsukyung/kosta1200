package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ReviewVO implements Serializable {
	private int review_seq;
	private String review_date;
	private String review_rating;
	private String review_content;
	private String review_picture;
	private int shoporder_seq;
	
	public ReviewVO() {}

	public ReviewVO(int review_seq, String review_date, String review_rating, String review_content,
			String review_picture, int shoporder_seq) {
		super();
		this.review_seq = review_seq;
		this.review_date = review_date;
		this.review_rating = review_rating;
		this.review_content = review_content;
		this.review_picture = review_picture;
		this.shoporder_seq = shoporder_seq;
	}

	public int getReview_seq() {
		return review_seq;
	}

	public void setReview_seq(int review_seq) {
		this.review_seq = review_seq;
	}

	public String getReview_date() {
		return review_date;
	}

	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}

	public String getReview_rating() {
		return review_rating;
	}

	public void setReview_rating(String review_rating) {
		this.review_rating = review_rating;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_picture() {
		return review_picture;
	}

	public void setReview_picture(String review_picture) {
		this.review_picture = review_picture;
	}

	public int getShoporder_seq() {
		return shoporder_seq;
	}

	public void setShoporder_seq(int shoporder_seq) {
		this.shoporder_seq = shoporder_seq;
	}

	@Override
	public String toString() {
		return "Review [review_seq=" + review_seq + ", review_date=" + review_date + ", review_rating=" + review_rating
				+ ", review_content=" + review_content + ", review_picture=" + review_picture + ", shoporder_seq="
				+ shoporder_seq + "]";
	}
	
	
}
