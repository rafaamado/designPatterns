package com.pattern.observer.minhaimpl;

import java.util.ArrayList;
import java.util.List;

//Observable
public abstract class Subject<T> {
	
	private List<Observer<T>> observers = new ArrayList<Observer<T>>();
	
	public void addObserver(Observer<T> observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer<T> observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(T value) {
		for(var observer : observers)
			observer.update(value);
	}
}
