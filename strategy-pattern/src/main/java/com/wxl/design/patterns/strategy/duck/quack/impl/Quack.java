package com.wxl.design.patterns.strategy.duck.quack.impl;

import com.wxl.design.patterns.strategy.duck.quack.QuackBehavior;

/**
 * 呱呱叫
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:41:09
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");

	}

}
