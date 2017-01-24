/**
 * 
 */
package com.wxl.design.patterns.factory.pizza;

import com.wxl.design.patterns.factory.pizza.chicago.ChicagoStylePizzaStore;
import com.wxl.design.patterns.factory.pizza.ny.NYStylePizzaStore;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:57:36
 */
public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
