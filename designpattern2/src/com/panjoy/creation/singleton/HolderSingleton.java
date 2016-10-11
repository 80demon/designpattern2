package com.panjoy.creation.singleton;

public class HolderSingleton {
	/**
	 * 类级的内部类，也就是静态的成员式内部类，
	 * 该内部类的实例与外部类的实例 没有绑定关系，
	 * 而且只有被调用到时才会装载，从而实现了延迟加载。
	 */
	private HolderSingleton() {
	}

	private static class SingletonHolder {
		private static HolderSingleton instance = new HolderSingleton();
	}

	public HolderSingleton getInstace() {
		return SingletonHolder.instance;
	}
}
