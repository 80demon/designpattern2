package com.panjoy.structure.facade;

public class Facade {

	public void operate() {
		ModuleA a = new ModuleA();
		ModuleB b = new ModuleB();
		ModuleC c = new ModuleC();
		a.testA();
		b.testB();
		c.testC();
	}
}
