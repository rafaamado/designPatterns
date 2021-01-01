package com.pattern.adapter;

import com.pattern.adapter.avaFilters.Caramel;

// Same function that CaramelFilter but in this example is using inheritance
// Favor composition over inheritance. If Filter was a abstract class this approach wouldn't be able to 
// extends Caramel and Filter
public class CaramelAdapter extends Caramel implements Filter {

	@Override
	public void apply(Image image) {
		init();
		render(image);
	}
	
}
