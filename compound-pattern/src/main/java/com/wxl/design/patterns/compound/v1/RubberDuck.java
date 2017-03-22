/**
 * 
 */
package com.wxl.design.patterns.compound.v1;

/**
 * 橡皮鸭
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:28:25
 */
public class RubberDuck implements Quackable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.Quackable#quack()
	 */
	@Override
	public void quack() {
		// 吱吱叫
		System.out.println("Squeak");
	}

}
