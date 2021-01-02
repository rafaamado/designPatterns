package com.pattern.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
	
	private Map<String, Ebook> ebooks = new HashMap<String,Ebook>();
	
	public void add(Ebook ebook) {
		ebooks.put(ebook.getFileName(), ebook);
	}
	
	public void openEbook(String fileName) {
		ebooks.get(fileName).show();
	}
}
