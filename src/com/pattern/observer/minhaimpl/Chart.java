package com.pattern.observer.minhaimpl;

public class Chart implements Observer<DataSource> {

	@Override
	public void update(DataSource dataSource) {
		System.out.println("Chart Got Updated: " + dataSource.getValue());
	}
	
}
