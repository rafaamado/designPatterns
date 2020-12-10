package com.pattern.observer;

public class SpreadSheet implements Observer {

	private DataSource datasource;
	
	public SpreadSheet(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void update() {
		System.out.println("SpreedSheet Got Notified: " + datasource.getValue());
		
	}

}
