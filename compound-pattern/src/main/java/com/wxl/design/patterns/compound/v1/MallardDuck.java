/**
 * 
 */
package com.wxl.design.patterns.compound.v1;

/**
 * 绿头鸭
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:25:25
 */
public class MallardDuck implements Quackable {

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
