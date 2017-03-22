/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:41:12
 */
public class QuackCounter implements Quackable {
	Quackable quack;
	static int numberOfQuacks;

	/**
	 * @param quack
	 */
	public QuackCounter(Quackable quack) {
		this.quack = quack;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v1.Quackable#quack()
	 */
	@Override
	public void quack() {
		quack.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
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
		quack.regiestObservable(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v6.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		quack.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return quack.toString();
	}

}
