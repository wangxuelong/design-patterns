/**
 * 
 */
package com.wxl.design.partterns.template.method;

/**
 * 咖啡
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:16:28
 */
public class Coffee extends CaffeineBeverage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.partterns.template.method.CaffeineBeverage#brew()
	 */
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.partterns.template.method.CaffeineBeverage#addCondiments()
	 */
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
