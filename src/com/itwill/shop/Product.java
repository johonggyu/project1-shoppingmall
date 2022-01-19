package com.itwill.shop;

public class Product {
	private int no;

	public Product(int no) {
		super();
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Product [no=" + no + "]";
	}
	
}
