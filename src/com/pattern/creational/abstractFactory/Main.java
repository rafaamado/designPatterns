package com.pattern.creational.abstractFactory;

import com.pattern.creational.abstractFactory.ant.AntWidgetFactory;
import com.pattern.creational.abstractFactory.app.ContactForm;
import com.pattern.creational.abstractFactory.materia.MaterialWidgetFactory;

public class Main {

	public static void main(String[] args) {
		new ContactForm().render(new MaterialWidgetFactory());
		
		new ContactForm().render(new AntWidgetFactory());
	}

}
