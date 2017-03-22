/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

import java.util.ArrayList;

/**
 * 观察者
 * 
 * @author Wang XueLong
 * @Date 2017年3月27日 下午9:12:40
 */
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	/**
	 * @param observers
	 * @param duck
	 */
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v6.QuackObservable#regiestObservable(
	 * java.util.Observer)
	 */
	@Override
	public void regiestObservable(Observer observer) {
		observers.add(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v6.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(duck);
		}
	}

}
