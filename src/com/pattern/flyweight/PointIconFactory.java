package com.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
	
	private Map<PointType, PointIcon> icons = new HashMap<PointType, PointIcon>();
	
	public PointIcon getPointIcon(PointType type) {
		// key -> value
		// PointType -> PointIcon
		if(!icons.containsKey(type)) {
			var icon = new PointIcon(type, null);
			//hospital.jpg
			icons.put(type, icon);
		}
		
		return icons.get(type);
	}
}
