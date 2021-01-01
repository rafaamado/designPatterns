package com.pattern.adapter;

import com.pattern.adapter.avaFilters.Caramel;

public class Main {
	public static void main(String[] args) {
		var imageView = new ImageView(new Image());
		imageView.apply(new VividFilter());
		
		//imageView.apply(new Caramel());
		imageView.apply(new CaramelFilter(new Caramel()));
	}
}
