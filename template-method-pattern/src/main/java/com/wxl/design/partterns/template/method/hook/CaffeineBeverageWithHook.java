/**
 * 
 */
package com.wxl.design.partterns.template.method.hook;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:29:13
 */
public abstract class CaffeineBeverageWithHook {
	/**
	 * 准备
	 */
	final public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
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

	/**
	 * 
	 * 
	 * 钩子方法，子类可以选择是否实现该方法。
	 * 
	 * @return
	 */
	boolean customerWantsCondiments() {
		return true;
	}
}
