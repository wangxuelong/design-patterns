/**
 * 
 */
package com.wxl.design.patterns.composite.v1;

import java.util.Iterator;

/**
 * 菜单项（叶子节点）
 * 
 * @author Wang XueLong
 * @Date 2017年2月21日 下午9:55:20
 */
public class MenuItem extends MenuComponent {
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 素食
	 */
	private boolean vegetarian;

	/**
	 * 价格
	 */
	private double price;

	/**
	 * @param name
	 * @param description
	 * @param vegetarian
	 * @param price
	 */
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * @return the vegetarian
	 */
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * @return the price
	 */
	@Override
	public double getPrice() {
		return price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.composite.v1.MenuComponent#print()
	 */
	@Override
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.print(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.composite.v1.MenuComponent#createIterator()
	 */
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}
