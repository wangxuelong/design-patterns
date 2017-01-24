/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.chicago;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;
import com.wxl.design.patterns.factory.pizza.PizzaStore;

/**
 * 芝加哥披萨店
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:48:43
 */
public class ChicagoStylePizzaStore extends PizzaStore {

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
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		}
		return pizza;
	}
}
