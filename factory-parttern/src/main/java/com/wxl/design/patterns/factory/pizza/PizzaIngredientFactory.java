/**
 * 
 */
package com.wxl.design.patterns.factory.pizza;

import com.wxl.design.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.wxl.design.patterns.factory.pizza.ingredient.clams.Clams;
import com.wxl.design.patterns.factory.pizza.ingredient.dough.Dough;
import com.wxl.design.patterns.factory.pizza.ingredient.pepperoni.Pepperoni;
import com.wxl.design.patterns.factory.pizza.ingredient.sauce.Sauce;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Veggies;

/**
 * 原料工厂
 * 
 * @author Wang XueLong
 * @Date 2017年1月26日 上午10:10:28
 */
public interface PizzaIngredientFactory {
	/**
	 * 生产面团
	 * 
	 * @return
	 */
	Dough createDough();

	/**
	 * 生产酱料
	 * 
	 * @return
	 */
	Sauce createSauce();

	/**
	 * 生产芝士
	 * 
	 * @return
	 */
	Cheese createCheese();

	/**
	 * 生产素食
	 * 
	 * @return
	 */
	Veggies[] createVeggies();

	/**
	 * 生产意大利香肠
	 * 
	 * @return
	 */
	Pepperoni createPepperoni();

	/**
	 * 生产蛤蛎
	 * 
	 * @return
	 */
	Clams createClam();
}
