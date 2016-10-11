package com.panjoy.structure.compose.safemode;

public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		super();
		this.name = name;
	}

	@Override
	public void printStruct(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "-" + this.name);

	}

}
