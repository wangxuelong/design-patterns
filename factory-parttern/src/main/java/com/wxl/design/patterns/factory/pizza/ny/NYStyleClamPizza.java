/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.ny;

import com.wxl.design.patterns.factory.pizza.Pizza;
import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;

/**
 * 蛤蛎披萨
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:32:18
 */
public class NYStyleClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	/**
	 * @param ingredientFactory
	 */
	public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
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
