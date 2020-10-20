package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Vendor implements Serializable {
	private int vendor_seq;
	private String vendor_name;
	private String vendor_license;
	private String vendor_category;
	private String vendor_introduction;
	private int member_seq;
	private int admin_seq;
	
	public Vendor() {}

	public Vendor(int vendor_seq, String vendor_name, String vendor_license, String vendor_category,
			String vendor_introduction, int member_seq, int admin_seq) {
		super();
		this.vendor_seq = vendor_seq;
		this.vendor_name = vendor_name;
		this.vendor_license = vendor_license;
		this.vendor_category = vendor_category;
		this.vendor_introduction = vendor_introduction;
		this.member_seq = member_seq;
		this.admin_seq = admin_seq;
	}

	public int getVendor_seq() {
		return vendor_seq;
	}

	public void setVendor_seq(int vendor_seq) {
		this.vendor_seq = vendor_seq;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public String getVendor_license() {
		return vendor_license;
	}

	public void setVendor_license(String vendor_license) {
		this.vendor_license = vendor_license;
	}

	public String getVendor_category() {
		return vendor_category;
	}

	public void setVendor_category(String vendor_category) {
		this.vendor_category = vendor_category;
	}

	public String getVendor_introduction() {
		return vendor_introduction;
	}

	public void setVendor_introduction(String vendor_introduction) {
		this.vendor_introduction = vendor_introduction;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public int getAdmin_seq() {
		return admin_seq;
	}

	public void setAdmin_seq(int admin_seq) {
		this.admin_seq = admin_seq;
	}

	@Override
	public String toString() {
		return "Vendor [vendor_seq=" + vendor_seq + ", vendor_name=" + vendor_name + ", vendor_license="
				+ vendor_license + ", vendor_category=" + vendor_category + ", vendor_introduction="
				+ vendor_introduction + ", member_seq=" + member_seq + ", admin_seq=" + admin_seq + "]";
	}
	
	

}
