/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate.condiment;

import com.wxl.design.patterns.decorate.beverate.Beverate;

/**
 * 奶泡
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:26:18
 */
public class Whip extends CondimentDecorator {
	private Beverate beverate;

	/**
	 * @param beverate
	 */
	public Whip(Beverate beverate) {
		this.beverate = beverate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverate.getDescription() + ", Whip";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 0.1 + beverate.cost();
	}

}
