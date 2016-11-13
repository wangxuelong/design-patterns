package com.wangxuelong.example.patterns.hello;

/**
 * 绿头鸭
 * 
 * @author Wang XueLong
 * 
 */
public class MallardDuck extends Duck {

	@Override
	public void display() {
		// 外观是绿头
		System.err.println("绿色的头");
	}

}
