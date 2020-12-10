package com.pattern.visitor;

public interface Operation {
	//We should use this pattern when if our object structure is very stable,
	// but we want to frequently support new operations
	void apply(HeadingNode heading);
	void apply(AnchorNode anchor);
}
