package com.pattern.creational.abstractFactory.materia;

import com.pattern.creational.abstractFactory.Button;
import com.pattern.creational.abstractFactory.TextBox;
import com.pattern.creational.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

	@Override
	public Button createButton() {
		return new MaterialButton();
	}

	@Override
	public TextBox createTextBox() {
		return new MaterialTextBox();
	}

}
