package com.panjoy.behaviour.observer1;

import java.util.Enumeration;

public interface Subject {
	public void attach(Observer observer);

	public void detach(Observer observer);

	public void notifyObservers();

}
