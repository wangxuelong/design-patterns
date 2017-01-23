/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate.condiment;

import com.wxl.design.patterns.decorate.beverate.Beverate;

/**
 * 牛奶
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:44:00
 */
public class Milk extends CondimentDecorator {
	private Beverate beverate;

	/**
	 * @param beverate
	 */
	public Milk(Beverate beverate) {
		this.beverate = beverate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.decorate.beverate.condiment.CondimentDecorator
	 * #getDescription()
	 */
	@Override
	public String getDescription() {
		return beverate.getDescription() + ", Milk";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.beverate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 0.1 + beverate.cost();
	}

}
