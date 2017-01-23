/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate;

/**
 * 低咖啡因
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:38:34
 */
public class Decaf extends Beverate {

	/**
	 * 
	 */
	public Decaf() {
		super.description = "Decaf";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 1.05;
	}

}
