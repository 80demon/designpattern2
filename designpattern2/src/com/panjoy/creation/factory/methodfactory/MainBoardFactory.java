package com.panjoy.creation.factory.methodfactory;

public class MainBoardFactory {

	public static MainBoard createMainBoard(int type) {
		MainBoard mainboard = null;
		if (type == 1) {
			return new IntelMainBoard(755);
		} else if (type == 2) {
			return new AmdMainBoard(938);
		}
		return mainboard;
	}
}
