package com.panjoy.structure.flyweight;

public class ConcreteFlyWeight implements FlyWeight {
	private String name;

	public ConcreteFlyWeight(String name) {
		super();
		this.name = name;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Concrete---Flyweight : " + name);
	}
}
