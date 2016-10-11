package com.panjoy.creation.factory.methodfactory;

public class AmdMainBoard implements MainBoard {
	private int cpuHoles = 0;

	public AmdMainBoard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCpu() {
		System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);

	}

}
