package com.panjoy.creation.factory.methodfactory;

public class ComputerEngineer {
	private Cpu cpu = null;
	private MainBoard mainboard = null;

	public void makeComputer(int cpuType, int mbType) {
		prepareHardwares(cpuType, mbType);
	}

	private void prepareHardwares(int cpuType, int mbType) {
		// ����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
		// ���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�

		// ֱ������Ӧ�Ĺ�����ȡ
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainboard = MainBoardFactory.createMainBoard(mbType);

		// ��������Ƿ����
		this.cpu.calculate();
		this.mainboard.installCpu();
	}
}
