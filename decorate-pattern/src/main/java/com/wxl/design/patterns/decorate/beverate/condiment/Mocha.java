/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate.condiment;

import com.wxl.design.patterns.decorate.beverate.Beverate;

/**
 * 摩卡
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:23:05
 */
public class Mocha extends CondimentDecorator {
	private Beverate beverate;

	/**
	 * @param beverate
	 */
	public Mocha(Beverate beverate) {
		this.beverate = beverate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverate.getDescription() + ", Mocha";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 0.2 + beverate.cost();
	}

}
