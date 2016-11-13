package com.wxl.design.patterns.strategy.duck;

/**
 * 诱饵鸭
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午1:53:39
 */
public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("诱饵鸭");
	}

}
