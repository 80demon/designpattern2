package com.panjoy.structure.compose.transiention;

import java.util.Enumeration;

public class Leaf implements Component {

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		System.out.println("this is a leaf.....");
	}

	@Override
	public Component getComposite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public Enumeration Components() {
		// TODO Auto-generated method stub
		return null;
	}

}
