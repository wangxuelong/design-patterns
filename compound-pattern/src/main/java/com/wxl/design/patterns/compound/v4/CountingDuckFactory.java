/**
 * 
 */
package com.wxl.design.patterns.compound.v4;

import com.wxl.design.patterns.compound.v1.DuckCall;
import com.wxl.design.patterns.compound.v1.MallardDuck;
import com.wxl.design.patterns.compound.v1.Quackable;
import com.wxl.design.patterns.compound.v1.RedheadDuck;
import com.wxl.design.patterns.compound.v1.RubberDuck;
import com.wxl.design.patterns.compound.v3.QuackCounter;

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v4.AbstractDuckFactory#createRedheadDuck
	 * ()
	 */
	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v4.AbstractDuckFactory#createDuckCall()
	 */
	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v4.AbstractDuckFactory#createRubberdDuck
	 * ()
	 */
	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
