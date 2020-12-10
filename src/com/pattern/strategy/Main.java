package com.pattern.strategy;

public class Main {

	public static void main(String[] args) {
		var imageStorage = new ImageStorage();
		
		imageStorage.store("file", new JpegCompressor(), new BlackAndWhiteFilter());
	}
}
