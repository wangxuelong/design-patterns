/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 * 鸭子工厂
 * 
 * 获取装饰后的鸭子
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:53:00
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v4.AbstractDuckFactory#createMallardDuck
	 * ()
	 */
	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

}
