 package com.pattern.creational.abstractFactory.ant;

import com.pattern.creational.abstractFactory.Button;

public class AntButton implements Button{

	@Override
	public void render() {
		System.out.println("Ant Button");
	}

}
