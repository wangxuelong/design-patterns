/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.ny;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:30:22
 */
public class NYStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * 
	 */
	// public NYStyleCheesePizza() {
	// super.name = "NY Style Sauce and Cheese Pizza";
	// super.dough = "Thin Crust Dough";
	// super.sauce = "Marinara Sauce";
	// super.toppings.add("Grated Reggiano Cheese");
	// }

	/**
	 * @param ingredientFactory
	 */
	public NYStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.factory.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {

	}
}
