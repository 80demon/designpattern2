package com.panjoy.behaviour.observer1;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {
	private Vector<Observer> observers = new Vector<Observer>();

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.removeElement(observer);

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> enumeration = Observers();
		while (enumeration.hasMoreElements()) {
			((Observer) enumeration.nextElement()).update();

		}
	}

	public Enumeration Observers() {
		System.out.println("-------------" + observers.size());
		return observers.elements();

	}

}
