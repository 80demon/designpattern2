package com.panjoy.structure.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		FilterHander handler1 = new FilterHander(
				"com.panjoy.structure.proxy.dynamic.FirstAction");
		Action first = (Action) Proxy.newProxyInstance(
				Action.class.getClassLoader(), new Class[] { Action.class },
				handler1);
		first.execute();
	}
}
