package kosta1200.todayroom.vo;

import java.io.Serializable;

public class BasketVO implements Serializable {
	private int basket_seq;
	private String basket_quantity;
	private int product_seq;
	
	public BasketVO() {}

	public BasketVO(int basket_seq, String basket_quantity, int product_seq) {
		super();
		this.basket_seq = basket_seq;
		this.basket_quantity = basket_quantity;
		this.product_seq = product_seq;
	}

	public int getBasket_seq() {
		return basket_seq;
	}

	public void setBasket_seq(int basket_seq) {
		this.basket_seq = basket_seq;
	}

	public String getBasket_quantity() {
		return basket_quantity;
	}

	public void setBasket_quantity(String basket_quantity) {
		this.basket_quantity = basket_quantity;
	}

	public int getProduct_seq() {
		return product_seq;
	}

	public void setProduct_seq(int product_seq) {
		this.product_seq = product_seq;
	}

	@Override
	public String toString() {
		return "Basket [basket_seq=" + basket_seq + ", basket_quantity=" + basket_quantity + ", product_seq="
				+ product_seq + "]";
	}
	
	


}
