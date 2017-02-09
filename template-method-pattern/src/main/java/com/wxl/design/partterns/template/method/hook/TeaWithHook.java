/**
 * 
 */
package com.wxl.design.partterns.template.method.hook;

/**
 * 茶
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:19:31
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.partterns.template.method.CaffeineBeverage#brew()
	 */
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.partterns.template.method.CaffeineBeverage#addCondiments()
	 */
	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
