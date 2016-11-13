package com.wxl.design.patterns.strategy.duck.quack.impl;

import com.wxl.design.patterns.strategy.duck.quack.QuackBehavior;

/**
 * 吱吱叫
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:41:49
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");

	}

}
