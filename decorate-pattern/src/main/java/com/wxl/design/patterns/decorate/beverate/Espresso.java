/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate;


/**
 * 浓缩咖啡
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:32:37
 */
public class Espresso extends Beverate {

	/**
	 * 
	 */
	public Espresso() {
		super.description = "Espresso";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
