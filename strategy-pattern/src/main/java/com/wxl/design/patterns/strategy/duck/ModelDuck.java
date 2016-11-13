/**
 * 
 */
package com.wxl.design.patterns.strategy.duck;

import com.wxl.design.patterns.strategy.duck.fly.impl.FlyNoWay;
import com.wxl.design.patterns.strategy.duck.quack.impl.Quack;

/**
 * 模型鸭
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午2:07:11
 */
public class ModelDuck extends Duck {

	/**
	 */
	public ModelDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quackBehavior = new Quack();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wangxuelong.example.patterns.hello.duck.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I'm a model duck.");
	}

}
