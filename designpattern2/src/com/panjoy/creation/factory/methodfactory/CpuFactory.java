package com.panjoy.creation.factory.methodfactory;

public class CpuFactory {
	public static Cpu createCpu(int type) {
		Cpu cpu = null;
		if (type == 1) {
			return new IntelCpu(755);
		} else if (type == 2) {
			return new AmdCpu(938);
		}

		return cpu;

	}
}
