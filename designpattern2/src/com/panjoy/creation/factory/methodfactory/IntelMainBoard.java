package com.panjoy.creation.factory.methodfactory;

public class IntelMainBoard implements MainBoard {
	private int cpuHoles;

	public IntelMainBoard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCpu() {
		System.out.println("Intel�����CPU��ۿ����ǣ�" + cpuHoles);
	}

}
