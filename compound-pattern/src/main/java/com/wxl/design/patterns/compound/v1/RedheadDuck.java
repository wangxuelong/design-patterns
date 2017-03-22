/**
 * 
 */
package com.wxl.design.patterns.compound.v1;

/**
 * 红头鸭
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:26:38
 */
public class RedheadDuck implements Quackable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.Quackable#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
