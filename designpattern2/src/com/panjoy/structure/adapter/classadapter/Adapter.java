package com.panjoy.structure.adapter.classadapter;

public class Adapter extends Adaptee implements Target {

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		super.sepecialOperate();
		System.out.println("func1");
	}

	@Override
	public void func2() {
		// TODO Auto-generated method stub
		System.out.println("func2");
	}

}
