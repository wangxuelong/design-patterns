/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate;


/**
 * 辛巴克咖啡
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:35:30
 */
public class HouseBlend extends Beverate {

	/**
	 * 
	 */
	public HouseBlend() {
		super.description = "Hourse Blend Coffee";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.decorate.Beverate#cost()
	 */
	@Override
	public double cost() {
		return 0.89;
	}

}
