package com.panjoy.creation.factory.abstractfactory;

public class AmdCpu implements Cpu {
	private int pins;

	@Override
	public void calculate() {
		System.out.println("AMD CPUµÄÕë½ÅÊı£º" + pins);
	}

	public AmdCpu(int pins) {
		this.pins = pins;
	}

}
