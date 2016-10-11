package com.panjoy.creation.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
		IProduct product = Factory.produce("A");
		product.show();
	}
}
