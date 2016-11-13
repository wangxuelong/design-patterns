package com.wxl.design.patterns.strategy.duck;


/**
 * 红头鸭
 * 
 * @author Wang XueLong
 * 
 */
public class RedheadDuck extends Duck {

	@Override
	public void display() {
		// 外观是红头
		System.err.println("红色的头");
	}

}
