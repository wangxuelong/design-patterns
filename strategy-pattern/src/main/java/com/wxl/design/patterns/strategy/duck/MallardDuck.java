package com.wxl.design.patterns.strategy.duck;

import com.wxl.design.patterns.strategy.duck.fly.impl.FlyWithWings;
import com.wxl.design.patterns.strategy.duck.quack.impl.Quack;

/**
 * 绿头鸭
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:55:56
 */
public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// 外观是绿头
		System.err.println("我是一个绿头鸭子。");
	}

}
