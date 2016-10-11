package com.panjoy.structure.compose.transiention;

public class Client {
	public static void main(String[] args) {
		Composite root = new Composite();
		Composite node1 = new Composite();
		Leaf leaf1 = new Leaf();
		root.add(node1);
		root.add(leaf1);
		root.sampleOperation();
	}
}
