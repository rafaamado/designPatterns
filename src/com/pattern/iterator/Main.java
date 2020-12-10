package com.pattern.iterator;

public class Main {
	public static void main(String[] args) {
		var history = new BrowseHistory();
		history.push("a");
		history.push("b");
		history.push("c");
		
		Iterator<String> iterator = history.createIterator();
		while(iterator.hasNext()) {
			String url = iterator.current();
			System.out.println(url);
			iterator.next();
		}
	}
}
