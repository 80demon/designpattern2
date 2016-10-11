package com.panjoy.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FilterHander implements InvocationHandler {
	private String className;

	public FilterHander(String className) {
		super();
		this.className = className;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if (className.endsWith("Action")) {
			System.out.println(className + "." + method.getName());
			method.invoke(Class.forName(className).newInstance(), args);
			return null;
		} else {
			System.out.println(className + " doesn't end with 'Action'");
			return null;
		}
	}

}
