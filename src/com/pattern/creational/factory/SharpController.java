package com.pattern.creational.factory;

import com.pattern.creational.factory.matcha.Controller;
import com.pattern.creational.factory.matcha.ViewEngine;
import com.pattern.creational.factory.sharp.SharpViewEngine;

public class SharpController extends Controller{

	@Override
	protected ViewEngine createViewEngine() {
		return new SharpViewEngine();
	}
}
