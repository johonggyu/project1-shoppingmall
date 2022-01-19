package com.itwill.shop;

public class Member {
	private int no;

	public Member(int no) {
		super();
		this.no = no;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
