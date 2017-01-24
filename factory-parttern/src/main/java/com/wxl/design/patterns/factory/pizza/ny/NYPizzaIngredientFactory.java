/**
 * 
 */
package com.wxl.design.patterns.factory.pizza.ny;

import com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory;
import com.wxl.design.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.wxl.design.patterns.factory.pizza.ingredient.cheese.ReggianoCheese;
import com.wxl.design.patterns.factory.pizza.ingredient.clams.Clams;
import com.wxl.design.patterns.factory.pizza.ingredient.clams.FreshClam;
import com.wxl.design.patterns.factory.pizza.ingredient.dough.Dough;
import com.wxl.design.patterns.factory.pizza.ingredient.dough.ThinCrustDough;
import com.wxl.design.patterns.factory.pizza.ingredient.pepperoni.Pepperoni;
import com.wxl.design.patterns.factory.pizza.ingredient.pepperoni.SlicedPepperoni;
import com.wxl.design.patterns.factory.pizza.ingredient.sauce.MarinaraSauce;
import com.wxl.design.patterns.factory.pizza.ingredient.sauce.Sauce;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Garlic;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Mushroom;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Onion;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.RedPepper;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Veggies;

/**
 * 纽约原料工厂
 * 
 * @author Wang XueLong
 * @Date 2017年1月26日 上午10:27:03
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.factory.pizza.PizzaIngredientFactory#createDough
	 * ()
	 */
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
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
		return new MarinaraSauce();
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
		return new ReggianoCheese();
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
		return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
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
		return new FreshClam();
	}

}
