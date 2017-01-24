/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.simple;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:32:00
 */
public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * @param ingredientFactory
	 */
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
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
