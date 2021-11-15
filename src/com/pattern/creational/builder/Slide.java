package com.pattern.creational.builder;

public class Slide {
	private String text;
	
	public Slide(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
