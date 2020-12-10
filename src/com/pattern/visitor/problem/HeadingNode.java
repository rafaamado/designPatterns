package com.pattern.visitor.problem;

public class HeadingNode implements HtmlNode {

	@Override
	public void hightlight() {
		System.out.println("Highlight-heading");
		
	}

}
