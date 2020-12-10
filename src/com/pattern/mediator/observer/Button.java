package com.pattern.mediator.observer;

public class Button extends UIControl {
	
	private boolean isEnabled;

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		notifyEventHandlers();
	}
	
	
}
