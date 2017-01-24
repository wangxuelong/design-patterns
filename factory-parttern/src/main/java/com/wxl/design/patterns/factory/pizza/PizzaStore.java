/**
 * 
 */
package com.wxl.design.patterns.factory.pizza;

/**
 * 披萨店
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:39:07
 */
public abstract class PizzaStore {

	/**
	 * 披萨订单
	 * 
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	/**
	 * 制作披萨
	 * 
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
