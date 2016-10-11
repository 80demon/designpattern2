package com.panjoy.creation.factory.methodfactory;

public class ComputerEngineer {
	private Cpu cpu = null;
	private MainBoard mainboard = null;

	public void makeComputer(int cpuType, int mbType) {
		prepareHardwares(cpuType, mbType);
	}

	private void prepareHardwares(int cpuType, int mbType) {
		// 这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
		// 可是，装机工程师并不知道如何去创建，怎么办呢？

		// 直接找相应的工厂获取
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainboard = MainBoardFactory.createMainBoard(mbType);

		// 测试配件是否好用
		this.cpu.calculate();
		this.mainboard.installCpu();
	}
}
