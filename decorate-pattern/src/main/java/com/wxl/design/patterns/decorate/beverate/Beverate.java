/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate;

/**
 * 饮料
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:14:53
 */
public abstract class Beverate {
	protected String description = "Unknown Beverate";

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 价格
	 * 
	 * @return
	 */
	public abstract double cost();

}
