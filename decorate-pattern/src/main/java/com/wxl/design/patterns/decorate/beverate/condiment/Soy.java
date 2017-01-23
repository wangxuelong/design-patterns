/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate.condiment;

import com.wxl.design.patterns.decorate.beverate.Beverate;

/**
 * 豆浆
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:45:40
 */
public class Soy extends CondimentDecorator {
	private Beverate beverate;

	/**
	 * @param beverate
	 */
	public Soy(Beverate beverate) {
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
		return beverate.getDescription() + ", Soy";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.beverate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 0.15 + beverate.cost();
	}

}
