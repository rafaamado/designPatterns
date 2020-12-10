package com.pattern.command;

import com.pattern.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Black and White");
		
	}

}
