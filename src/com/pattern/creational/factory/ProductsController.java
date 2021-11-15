package com.pattern.creational.factory;

import java.util.HashMap;
import java.util.Map;

import com.pattern.creational.factory.matcha.Controller;

public class ProductsController extends Controller {

	public void listProduct() {
		//Get product from a database
		Map<String, Object> context = new HashMap<>();
		// context.put(products);
		render("products.html", context);
	}
}
