package com.wxl.design.patterns.strategy.duck.fly.impl;

import com.wxl.design.patterns.strategy.duck.fly.FlyBehavior;

/**
 * 火箭动力飞行
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:48:26
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm fly with a recket!");
	}

}
