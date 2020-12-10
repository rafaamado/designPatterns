package com.pattern.chainOfResposability;

public class Compressor extends Handler {
	public Compressor(Handler next) {
		super(next);
	}

	@Override
	public boolean doHandle(HttpRequest request) {
		
		System.out.println("Compress");	
		
		// false - keep the processing to the next handler
		// true - stop the processing of the chain
		return false; 
	}
}
