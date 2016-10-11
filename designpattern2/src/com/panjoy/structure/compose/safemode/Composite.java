package com.panjoy.structure.compose.safemode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {
	private List<Component> childComponents = new ArrayList<Component>();
	// 组合对象的名称
	private String name;

	public Composite(String name) {
		this.name = name;
	}

	public void addChild(Component child) {
		childComponents.add(child);
	}

	public void removeChild(int index) {
		childComponents.remove(index);
	}

	public List<Component> getComponents() {
		return childComponents;

	}

	// 打印自身结构
	@Override
	public void printStruct(String name) {
		// TODO Auto-generated method stub
		// 先把自己输出
		System.out.println(name + "+" + this.name);
		if (childComponents != null) {
			name += "  ";
			//
			for (Component c : childComponents) {
				c.printStruct(name);
			}
		}

	}

}
