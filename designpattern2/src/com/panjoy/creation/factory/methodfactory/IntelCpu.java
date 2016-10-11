package com.panjoy.creation.factory.methodfactory;

public class IntelCpu implements Cpu {
	private int pins = 0;

	public IntelCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		System.out.println("Intel CPUµÄÕë½ÅÊı£º" + pins);

	}

}
