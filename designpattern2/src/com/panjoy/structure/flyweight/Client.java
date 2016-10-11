package com.panjoy.structure.flyweight;

public class Client {
	FlyWeightFactory flyFactory = new FlyWeightFactory();
	FlyWeight fw1, fw2, fw3, fw4, fw5, fw6;

	public Client() {
		// TODO Auto-generated constructor stub
		fw1 = flyFactory.getFlyWeight("google");
		fw2 = flyFactory.getFlyWeight("microsoft");
		fw3 = flyFactory.getFlyWeight("ss");
		fw4 = flyFactory.getFlyWeight("ww");
		fw5 = flyFactory.getFlyWeight("ww");
		fw6 = flyFactory.getFlyWeight("ww");
	}

	public void showFlyWeight() {
		fw1.operation();
		fw2.operation();
		fw3.operation();
		fw4.operation();
		fw5.operation();
		fw6.operation();
		System.out.println("flyweight size=" + flyFactory.getFlyWeightSize());
	}

	public static void main(String[] args) {
		Client c1 = new Client();
		c1.showFlyWeight();
		// 可见创建更多，还是只有4个，对象存储池子的。
		Client c2 = new Client();
		c2.showFlyWeight();

	}
}
