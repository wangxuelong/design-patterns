/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.chicago;

import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;
import com.wxl.design.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.wxl.design.patterns.factory.pizza.ingredient.cheese.MozzarellaCheese;
import com.wxl.design.patterns.factory.pizza.ingredient.clams.Clams;
import com.wxl.design.patterns.factory.pizza.ingredient.clams.FrozenClams;
import com.wxl.design.patterns.factory.pizza.ingredient.dough.Dough;
import com.wxl.design.patterns.factory.pizza.ingredient.dough.ThickCrustDough;
import com.wxl.design.patterns.factory.pizza.ingredient.pepperoni.Pepperoni;
import com.wxl.design.patterns.factory.pizza.ingredient.pepperoni.SlicedPepperoni;
import com.wxl.design.patterns.factory.pizza.ingredient.sauce.PlumTomatoSauce;
import com.wxl.design.patterns.factory.pizza.ingredient.sauce.Sauce;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.BlackOvlies;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Eggplant;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Spinach;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Veggies;

/**
 * 芝加哥原料工厂
 * 
 * @author Wang XueLong
 * @Date 2017年1月26日 上午10:27:03
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createDough
	 * ()
	 */
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createSauce
	 * ()
	 */
	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createCheese
	 * ()
	 */
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createVeggies
	 * ()
	 */
	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new BlackOvlies(), new Spinach(), new Eggplant() };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createPepperoni
	 * ()
	 */
	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createClam()
	 */
	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
