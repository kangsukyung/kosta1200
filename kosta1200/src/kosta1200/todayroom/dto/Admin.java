package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Admin implements Serializable {
	private int admin_id;
	private String admin_password;
	private String admin_name;
	private String admin_phone;
	private String admin_rating;
	private int admin_seq;
	
	public Admin() {}

	public Admin(int admin_id, String admin_password, String admin_name, String admin_phone, String admin_rating,
			int admin_seq) {
		super();
		this.admin_id = admin_id;
		this.admin_password = admin_password;
		this.admin_name = admin_name;
		this.admin_phone = admin_phone;
		this.admin_rating = admin_rating;
		this.admin_seq = admin_seq;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_phone() {
		return admin_phone;
	}

	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}

	public String getAdmin_rating() {
		return admin_rating;
	}

	public void setAdmin_rating(String admin_rating) {
		this.admin_rating = admin_rating;
	}

	public int getAdmin_seq() {
		return admin_seq;
	}

	public void setAdmin_seq(int admin_seq) {
		this.admin_seq = admin_seq;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_password=" + admin_password + ", admin_name=" + admin_name
				+ ", admin_phone=" + admin_phone + ", admin_rating=" + admin_rating + ", admin_seq=" + admin_seq + "]";
	}
	
	

}
