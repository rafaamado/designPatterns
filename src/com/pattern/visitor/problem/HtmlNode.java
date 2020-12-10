package com.pattern.visitor.problem;

public interface HtmlNode {
	void hightlight();
	
	//adding a new Operation obliges to implement the operation in all classes that implements this interface
}
