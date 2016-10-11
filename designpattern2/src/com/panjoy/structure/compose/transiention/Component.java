package com.panjoy.structure.compose.transiention;

import java.util.Enumeration;

public interface Component {
	void sampleOperation();

	Component getComposite();

	void add(Component component);

	void remove(int index);

	Enumeration Components();

}
