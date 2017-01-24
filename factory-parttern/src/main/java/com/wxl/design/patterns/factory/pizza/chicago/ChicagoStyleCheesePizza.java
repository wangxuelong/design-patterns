/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.chicago;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:30:22
 */
public class ChicagoStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * @param ingredientFactory
	 */
	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * 
	 */
	// public ChicagoStyleCheesePizza() {
	// super.name = "Chicago Style Deep Dish Cheese Pizza";
	// super.dough = "Extra Thick Crust Dough";
	// super.sauce = "Plum Tomato Sauce";
	// super.toppings.add("Shredded Mozzarella Cheese");
	// }

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.factory.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub

	}
}
