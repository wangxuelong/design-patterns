/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.ny;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;
import com.wxl.design.patterns.factory.pizza.PizzaStore;

/**
 * 纽约披萨店
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:47:53
 */
public class NYStylePizzaStore extends PizzaStore {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaStore#createPizza(java.lang
	 * .String)
	 */
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}
		return pizza;
	}

}
