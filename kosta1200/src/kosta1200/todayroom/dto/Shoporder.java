package kosta1200.todayroom.dto;

import java.io.Serializable;

public class Shoporder implements Serializable {
	private int shoporder_seq;
	private String shoporder_name;
	private String shoporder_email;
	private String shoporder_phone;
	private String shoporder_paymethod;
	private int basket_seq;
	private int shipping_seq;
	private int member_seq;
	
	public Shoporder() {}

	public Shoporder(int shoporder_seq, String shoporder_name, String shoporder_email, String shoporder_phone,
			String shoporder_paymethod, int basket_seq, int shipping_seq, int member_seq) {
		super();
		this.shoporder_seq = shoporder_seq;
		this.shoporder_name = shoporder_name;
		this.shoporder_email = shoporder_email;
		this.shoporder_phone = shoporder_phone;
		this.shoporder_paymethod = shoporder_paymethod;
		this.basket_seq = basket_seq;
		this.shipping_seq = shipping_seq;
		this.member_seq = member_seq;
	}

	public int getShoporder_seq() {
		return shoporder_seq;
	}

	public void setShoporder_seq(int shoporder_seq) {
		this.shoporder_seq = shoporder_seq;
	}

	public String getShoporder_name() {
		return shoporder_name;
	}

	public void setShoporder_name(String shoporder_name) {
		this.shoporder_name = shoporder_name;
	}

	public String getShoporder_email() {
		return shoporder_email;
	}

	public void setShoporder_email(String shoporder_email) {
		this.shoporder_email = shoporder_email;
	}

	public String getShoporder_phone() {
		return shoporder_phone;
	}

	public void setShoporder_phone(String shoporder_phone) {
		this.shoporder_phone = shoporder_phone;
	}

	public String getShoporder_paymethod() {
		return shoporder_paymethod;
	}

	public void setShoporder_paymethod(String shoporder_paymethod) {
		this.shoporder_paymethod = shoporder_paymethod;
	}

	public int getBasket_seq() {
		return basket_seq;
	}

	public void setBasket_seq(int basket_seq) {
		this.basket_seq = basket_seq;
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

	@Override
	public String toString() {
		return "Shoporder [shoporder_seq=" + shoporder_seq + ", shoporder_name=" + shoporder_name + ", shoporder_email="
				+ shoporder_email + ", shoporder_phone=" + shoporder_phone + ", shoporder_paymethod="
				+ shoporder_paymethod + ", basket_seq=" + basket_seq + ", shipping_seq=" + shipping_seq
				+ ", member_seq=" + member_seq + "]";
	}
	
	

}
