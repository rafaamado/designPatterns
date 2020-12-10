package com.pattern.strategy;

public class BlackAndWhiteFilter implements Filter {

	@Override
	public void apply(String fileName) {
		System.out.println("Apply B&W filter");
	}

}
