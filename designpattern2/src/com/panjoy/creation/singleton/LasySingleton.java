package com.panjoy.creation.singleton;

public class LasySingleton {
	private static LasySingleton instance = null;

	private LasySingleton() {
	}

	public synchronized static LasySingleton getInstance() {
		if (instance == null) {
			instance = new LasySingleton();
		}
		return instance;

	}
}
