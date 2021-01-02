package com.pattern.flyweight;

public class PointIcon {

	private final PointType type; // 4 bytes
	private final byte[] icon; // 20 KB - fictional value
	
	public PointIcon(PointType type, byte[] icon) {
		this.type = type;
		this.icon = icon;
	}

	public PointType getType() {
		return type;
	}

	public byte[] getIcon() {
		return icon;
	}
	
	
}
