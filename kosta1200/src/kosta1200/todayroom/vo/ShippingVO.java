package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ShippingVO implements Serializable {
	private int shipping_seq;
	private int member_seq;
	private String shipping_name;
	private String shipping_recipients;
	private String shipping_address;
	private String shipping_phone;
	
	public ShippingVO() {}

	public ShippingVO(int shipping_seq, int member_seq, String shipping_name, String shipping_recipients,
			String shipping_address, String shipping_phone) {
		super();
		this.shipping_seq = shipping_seq;
		this.member_seq = member_seq;
		this.shipping_name = shipping_name;
		this.shipping_recipients = shipping_recipients;
		this.shipping_address = shipping_address;
		this.shipping_phone = shipping_phone;
	}

	public int getShipping_seq() {
		return shipping_seq;
	}

	public void setShipping_seq(int shipping_seq) {
		this.shipping_seq = shipping_seq;
	}

	public int getMember_seq() {
		return member_seq;
	}

	public void setMember_seq(int member_seq) {
		this.member_seq = member_seq;
	}

	public String getShipping_name() {
		return shipping_name;
	}

	public void setShipping_name(String shipping_name) {
		this.shipping_name = shipping_name;
	}

	public String getShipping_recipients() {
		return shipping_recipients;
	}

	public void setShipping_recipients(String shipping_recipients) {
		this.shipping_recipients = shipping_recipients;
	}

	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	public String getShipping_phone() {
		return shipping_phone;
	}

	public void setShipping_phone(String shipping_phone) {
		this.shipping_phone = shipping_phone;
	}

	@Override
	public String toString() {
		return "Shipping [shipping_seq=" + shipping_seq + ", member_seq=" + member_seq + ", shipping_name="
				+ shipping_name + ", shipping_recipients=" + shipping_recipients + ", shipping_address="
				+ shipping_address + ", shipping_phone=" + shipping_phone + "]";
	}
	
	

}
