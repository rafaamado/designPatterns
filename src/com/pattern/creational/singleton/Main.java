package com.pattern.creational.singleton;

public class Main {

	public static void main(String[] args) {
		ConfigManager manager = ConfigManager.getInstance();
		manager.set("name", "Rafael");
		
		ConfigManager other = ConfigManager.getInstance();
		System.out.println(other.get("name"));
	}
}
