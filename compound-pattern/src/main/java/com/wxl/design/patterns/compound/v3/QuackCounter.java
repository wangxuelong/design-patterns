/**
 * 
 */
package com.wxl.design.patterns.compound.v3;

import com.wxl.design.patterns.compound.v1.Quackable;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:41:12
 */
public class QuackCounter implements Quackable {
	Quackable quack;
	static int numberOfQuacks;

	/**
	 * @param quack
	 */
	public QuackCounter(Quackable quack) {
		this.quack = quack;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v1.Quackable#quack()
	 */
	@Override
	public void quack() {
		quack.quack();
		numberOfQuacks++;
	}

	public static int getQuacks() {
		return numberOfQuacks;
	}

}
