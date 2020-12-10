package com.pattern.observer.minhaimpl;

public class SpreadSheet implements Observer<DataSource> {

	@Override
	public void update(DataSource datasource) {
		System.out.println("SpreedSheet Got Notified: " + datasource.getValue());
	}
}
