package com.panjoy.behaviour.observer1;

public class Client {
	public static void main(String[] args) {
		Observer observer = new ConcreteObserver();
		ConcreteSubject subject = new ConcreteSubject();
		subject.attach(observer);
		subject.notifyObservers();
	}
}
