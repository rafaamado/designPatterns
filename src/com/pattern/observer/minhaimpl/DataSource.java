package com.pattern.observer.minhaimpl;

public class DataSource extends Subject<DataSource> {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers(this);
	}
}
