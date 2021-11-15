package com.pattern.creational.abstractFactory.app;

import com.pattern.creational.abstractFactory.WidgetFactory;

public class ContactForm {
	
	//solution
	public void render(WidgetFactory factory) {
		factory.createTextBox().render();
		factory.createButton().render();
	}
	
	/* The problem:
	public void render(Theme theme) {
		if(theme == Theme.ANT) {
			new AntButton().render();
			new AntTextBox().render();
		}
		else if (theme == Theme.MATERIAL){
			new MaterialButton().render();
			new MaterialTextBox().render();
		}
	}
	*/	
}
