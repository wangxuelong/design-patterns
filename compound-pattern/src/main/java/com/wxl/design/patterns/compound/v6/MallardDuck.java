/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 * 绿头鸭
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:25:25
 */
public class MallardDuck implements Quackable {
	private QuackObservable observable;

	/**
	 * 
	 */
	public MallardDuck() {
		observable = new Observable(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack");
		this.notifyObservers();
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
		observable.regiestObservable(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v6.QuackObservable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mallard Duck";
	}

}
