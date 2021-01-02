package com.pattern.bridge.theProblem;

public class SonyRemoteControl extends RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Sony: turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("Sony: turnOff");
	}

}
