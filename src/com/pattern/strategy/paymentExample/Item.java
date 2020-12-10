package com.pattern.strategy.paymentExample;

public class Item {
	private Integer code;
	private double price;

	public Item(Integer code, double price) {
		this.code = code;
		this.price = price;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
