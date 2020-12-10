package com.pattern.command;

import com.pattern.command.fx.Button;

public class Main {

	public static void main(String[] args) {
		var composite = new CompositeCommand();
		composite.add(new ResizeCommand());
		composite.add(new BlackAndWhiteCommand());
		
		composite.execute();
	}
	
	/*public static void main(String[] args) {
		var service = new CustomerService();
		var command = new AddCustomerCommand(service);
		var button = new Button(command);
		
		button.click();
	}*/


}
