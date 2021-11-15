package com.pattern.creational.abstractFactory.materia;

import com.pattern.creational.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {

	@Override
	public void render() {
		System.out.println("Material TextBox");
	}

}
