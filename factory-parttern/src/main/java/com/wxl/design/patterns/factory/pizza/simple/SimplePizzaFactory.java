/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.simple;

import com.wxl.design.patterns.factory.pizza.Pizza;

/**
 * 披萨简单工厂
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:27:35
 */
public class SimplePizzaFactory {
	/**
	 * 创建披萨
	 * 
	 * @param type
	 * @return
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		// if (type.equals("cheese")) {
		// pizza = new CheesePizza();
		// } else if (type.equals("pepperoni")) {
		// pizza = new PepperoniPizza();
		// } else if (type.equals("clam")) {
		// pizza = new ClamPizza();
		// } else if (type.equals("veggie")) {
		// pizza = new VeggiePizza();
		// }
		return pizza;
	}
}
