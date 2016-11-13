package com.wxl.design.patterns.strategy.duck.quack.impl;

import com.wxl.design.patterns.strategy.duck.quack.QuackBehavior;

/**
 * 不会叫
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:42:38
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// 不会叫 Don't Think
		System.out.println("<< Silence >>");
	}

}
