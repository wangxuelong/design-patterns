/**
 * 
 */
package com.wxl.design.patterns.compound.v1;

/**
 * 鸭鸣器
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:27:29
 */
public class DuckCall implements Quackable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Kwak");
	}

}
