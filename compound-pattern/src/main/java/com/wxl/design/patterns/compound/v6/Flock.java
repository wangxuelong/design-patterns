/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 鸭群
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午10:01:49
 */
public class Flock implements Quackable {
	private List<Quackable> quackers = new ArrayList<Quackable>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v1.Quackable#quack()
	 */
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			iterator.next().quack();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v6.QuackObservable#regiestObservable(com
	 * .wxl.design.patterns.compound.v6.Observer)
	 */
	@Override
	public void regiestObservable(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			iterator.next().regiestObservable(observer);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v6.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
	}

}
