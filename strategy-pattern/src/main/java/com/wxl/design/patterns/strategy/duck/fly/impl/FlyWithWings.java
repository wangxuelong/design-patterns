package com.wxl.design.patterns.strategy.duck.fly.impl;

import com.wxl.design.patterns.strategy.duck.fly.FlyBehavior;

/**
 * 使用翅膀飞行
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:34:09
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");

	}

}
