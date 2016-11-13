package com.wxl.design.patterns.strategy.duck;

import com.wxl.design.patterns.strategy.duck.fly.FlyBehavior;
import com.wxl.design.patterns.strategy.duck.quack.QuackBehavior;

/**
 * 鸭子
 * 
 * @author Wang XueLong
 * 
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	/**
	 * 游泳
	 */
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	/**
	 * 外观
	 */
	public abstract void display();

	/**
	 * 飞
	 */
	public void performFly() {
		flyBehavior.fly();
	}

	/**
	 * 叫
	 */
	public void performQuack() {
		quackBehavior.quack();
	}

	/**
	 * @param flyBehavior
	 *            the flyBehavior to set
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * @param quackBehavior
	 *            the quackBehavior to set
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
