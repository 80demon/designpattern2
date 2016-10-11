package com.panjoy.creation.singleton;

public class HolderSingleton {
	/**
	 * �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬
	 * ���ڲ����ʵ�����ⲿ���ʵ�� û�а󶨹�ϵ��
	 * ����ֻ�б����õ�ʱ�Ż�װ�أ��Ӷ�ʵ�����ӳټ��ء�
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
