package com.pattern.creational.abstractFactory.ant;

import com.pattern.creational.abstractFactory.Button;
import com.pattern.creational.abstractFactory.TextBox;
import com.pattern.creational.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

	@Override
	public Button createButton() {
		return new AntButton();
	}

	@Override
	public TextBox createTextBox() {
		return new AntTextBox();
	}

}
