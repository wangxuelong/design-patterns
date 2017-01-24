/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.chicago;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;

/**
 * 素食披萨
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:32:34
 */
public class ChicagoStyleVeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * @param ingredientFactory
	 */
	public ChicagoStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
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
