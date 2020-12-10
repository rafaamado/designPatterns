package com.pattern.observer.minhaimpl;

public class Main {
	public static void main(String[] args) {
		var datasource = new DataSource();
		var sheet1 = new SpreadSheet();
		var sheet2 = new SpreadSheet();
		var chart = new Chart();
		
		datasource.addObserver(sheet1);
		datasource.addObserver(sheet2);
		datasource.addObserver(chart);
		
		datasource.setValue(10);
		
		datasource.setValue(20);
	}
}
