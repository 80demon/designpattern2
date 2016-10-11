package com.panjoy.creation.factory.abstractfactory;

public class Client {
	public static void main(String[] args) {
		ComputerEngineer cf = new ComputerEngineer();
		AbstractFactory af = new InterFactory();
		cf.makeComputer(af);

	}
}
