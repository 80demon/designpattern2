package com.panjoy.creation.factory.simplefactory;

public class Factory {
	public static IProduct produce(String type) {
		if (type.equals("A")) {
			return new ConcretProductA();
		} else if (type.equals("B")) {
			return new ConcreteProdcutB();
		} else {
			throw new RuntimeException("’“≤ªµΩ");

		}

	}
}
