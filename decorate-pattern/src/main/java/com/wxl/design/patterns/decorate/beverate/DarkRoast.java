/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate;

/**
 * 深培咖啡
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:19:59
 */
public class DarkRoast extends Beverate {

	/**
	 * 
	 */
	public DarkRoast() {
		super.description = "DarkRoast";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 0.99;
	}

}
