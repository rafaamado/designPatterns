package com.pattern.command;

import com.pattern.command.fx.Command;

public class ResizeCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Resize");
	}

}
