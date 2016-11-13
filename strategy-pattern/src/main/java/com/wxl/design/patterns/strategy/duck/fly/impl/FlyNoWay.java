package com.wxl.design.patterns.strategy.duck.fly.impl;

import com.wxl.design.patterns.strategy.duck.fly.FlyBehavior;

/**
 * 不飞行
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:37:01
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm can't fly!!");
	}

}
