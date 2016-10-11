package com.panjoy.creation.factory.abstractfactory;

public class InterFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	@Override
	public MainBoard createMainBoard() {
		// TODO Auto-generated method stub
		return new IntelMainBoard(755);
	}

}
