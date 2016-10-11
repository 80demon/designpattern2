package com.panjoy.structure.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
	private HashMap<String, FlyWeight> flyweights = new HashMap<String, FlyWeight>();

	public FlyWeight getFlyWeight(String str) {
		FlyWeight flyweight = flyweights.get(str);
		if (flyweight == null) {
			flyweight = new ConcreteFlyWeight(str);
			flyweights.put(str, flyweight);
		}
		return flyweight;

	}

	public int getFlyWeightSize() {
		return flyweights.size();
	}
}
