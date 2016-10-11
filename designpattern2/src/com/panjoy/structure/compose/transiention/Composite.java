package com.panjoy.structure.compose.transiention;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component {
	private Vector componentVector = new Vector();

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		Enumeration enumeration = Components();
		System.out.println("----------------------------------111");
		while (enumeration.hasMoreElements()) {
			((Component) enumeration.nextElement()).sampleOperation();
		}
	}

	@Override
	public Component getComposite() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		componentVector.add(component);
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		componentVector.remove(index);
	}

	@Override
	public Enumeration Components() {
		// TODO Auto-generated method stub
		return componentVector.elements();
	}

}
