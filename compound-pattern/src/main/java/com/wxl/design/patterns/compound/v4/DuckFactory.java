/**
 * 
 */
package com.wxl.design.patterns.compound.v4;

import com.wxl.design.patterns.compound.v1.DuckCall;
import com.wxl.design.patterns.compound.v1.MallardDuck;
import com.wxl.design.patterns.compound.v1.Quackable;
import com.wxl.design.patterns.compound.v1.RedheadDuck;
import com.wxl.design.patterns.compound.v1.RubberDuck;

/**
 * 鸭子工厂
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:51:42
 */
public class DuckFactory extends AbstractDuckFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v4.AbstractDuckFactory#createMallardDuck
	 * ()
	 */
	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v4.AbstractDuckFactory#
	 * createReadheadDuck()
	 */
	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v4.AbstractDuckFactory#createDuckCall()
	 */
	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
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
		return new RubberDuck();
	}

}
