package com.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
	public List<EditorState> states = new ArrayList<EditorState>();
	
	public void push(EditorState state) {
		states.add(state);
	}
	
	public EditorState pop() {
		int lastIndex = states.size()-1;
		EditorState lastState = states.get(lastIndex);
		states.remove(lastIndex);
		
		return lastState;
	}
}
