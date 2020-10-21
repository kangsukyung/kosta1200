package kosta1200.todayroom.vo;

import java.io.Serializable;

public class ProductVO implements Serializable{
	private int product_seq;
	private String product_name;
	private int product_price;
	private String product_lcategory;
	private String product_scategory;
	private int product_dlvchr;
	private int board_seq;
	
	public ProductVO() {}

	public int getProduct_seq() {
		return product_seq;
	}

	public void setProduct_seq(int product_seq) {
		this.product_seq = product_seq;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_lcategory() {
		return product_lcategory;
	}

	public void setProduct_lcategory(String product_lcategory) {
		this.product_lcategory = product_lcategory;
	}

	public String getProduct_scategory() {
		return product_scategory;
	}

	public void setProduct_scategory(String product_scategory) {
		this.product_scategory = product_scategory;
	}

	public int getDlvchr() {
		return product_dlvchr;
	}

	public void setDlvchr(int dlvchr) {
		this.product_dlvchr = dlvchr;
	}

	public int getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}

	public ProductVO(int product_seq, String product_name, int product_price, String product_lcategory,
			String product_scategory, int dlvchr, int board_seq) {
		super();
		this.product_seq = product_seq;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_lcategory = product_lcategory;
		this.product_scategory = product_scategory;
		this.product_dlvchr = dlvchr;
		this.board_seq = board_seq;
	}

	@Override
	public String toString() {
		return "Product [product_seq=" + product_seq + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_lcategory=" + product_lcategory + ", product_scategory="
				+ product_scategory + ", product_dlvchr=" + product_dlvchr + ", board_seq=" + board_seq + "]";
	}
	
	
	
	
}
