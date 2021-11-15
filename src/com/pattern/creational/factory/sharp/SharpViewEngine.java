package com.pattern.creational.factory.sharp;

import java.util.Map;

import com.pattern.creational.factory.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine {

	@Override
	public String render(String viewName, Map<String, Object> context) {
		return "View rendered by Sharp";
	}

}
