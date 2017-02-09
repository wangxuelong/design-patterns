/**
 * 
 */
package com.wxl.design.partterns.template.method;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:29:13
 */
public abstract class CaffeineBeverage {
	/**
	 * 准备
	 */
	final public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	/**
	 * 把水煮沸
	 */
	void boilWater() {
		System.out.println("Boiling water");
	}

	/**
	 * 冲泡
	 */
	abstract void brew();

	/**
	 * 把饮料倒进杯子
	 */
	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	/**
	 * 加入调料
	 */
	abstract void addCondiments();
}
