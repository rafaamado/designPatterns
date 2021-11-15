package com.pattern.creational.abstractFactory.ant;

import com.pattern.creational.abstractFactory.TextBox;

public class AntTextBox implements TextBox {

	@Override
	public void render() {
		System.out.println("Ant TextBox");
	}

}
