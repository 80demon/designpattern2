package com.panjoy.structure.compose.safemode;

public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("��װ");
		Composite c1 = new Composite("��װ");
		Composite c2 = new Composite("Ůװ");
		Leaf leaf1 = new Leaf("ȹ��");
		Leaf leaf2 = new Leaf("�п�");
		Leaf leaf3 = new Leaf("��װ");
		Leaf leaf4 = new Leaf("����");
		root.addChild(c1);
		root.addChild(c2);
		c1.addChild(leaf2);
		c1.addChild(leaf4);
		c2.addChild(leaf1);
		c2.addChild(leaf3);
		root.printStruct("  ");

	}
}
