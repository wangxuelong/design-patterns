/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.simple;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;

/**
 * 蛤蛎披萨
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:32:18
 */
public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	/**
	 * @param ingredientFactory
	 */
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.factory.pizza.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		System.out.println("Prepare " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
}
