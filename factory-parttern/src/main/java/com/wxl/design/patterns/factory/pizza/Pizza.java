/**
 * 
 */
package com.wxl.design.patterns.factory.pizza;

import java.util.Arrays;

import com.wxl.design.patterns.factory.pizza.ingredient.cheese.Cheese;
import com.wxl.design.patterns.factory.pizza.ingredient.clams.Clams;
import com.wxl.design.patterns.factory.pizza.ingredient.dough.Dough;
import com.wxl.design.patterns.factory.pizza.ingredient.pepperoni.Pepperoni;
import com.wxl.design.patterns.factory.pizza.ingredient.sauce.Sauce;
import com.wxl.design.patterns.factory.pizza.ingredient.veggies.Veggies;

/**
 * 披萨
 * 
 * @author Wang XueLong
 * @Date 2017年1月24日 下午12:28:19
 */
public abstract class Pizza {
	/**
	 * 名称
	 */
	protected String name;
	/**
	 * 面团
	 */
	protected Dough dough;
	/**
	 * 酱料类型
	 */
	protected Sauce sauce;
	/**
	 * 蔬菜
	 */
	protected Veggies veggies[];
	/**
	 * 芝士
	 */
	protected Cheese cheese;
	/**
	 * 意大利腊肠
	 */
	protected Pepperoni pepperoni;
	/**
	 * 蛤蛎
	 */
	protected Clams clam;

	/**
	 * 准备
	 */
	public abstract void prepare();

	/**
	 * 烘烤
	 */
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	/**
	 * 切片
	 */
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	/**
	 * 装盒
	 */
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies) + ", cheese=" + cheese
				+ ", pepperoni=" + pepperoni + ", clam=" + clam + "]";
	}
}
