package com.pattern.creational.prototype;

public class Circle implements Component {
	
	private int radius;
	
	@Override
	public void render() {
		System.out.println("Redering a circle");
	}
	
	@Override
	public Component clone() {
		Circle clone = new Circle();
		clone.setRadius(this.getRadius());
		return clone;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
