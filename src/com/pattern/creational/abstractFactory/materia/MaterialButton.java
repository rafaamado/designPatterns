 package com.pattern.creational.abstractFactory.materia;

import com.pattern.creational.abstractFactory.Button;

public class MaterialButton implements Button{

	@Override
	public void render() {
		System.out.println("Material Button");
	}

}
