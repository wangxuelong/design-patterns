/**
 * 
 */
package com.wxl.design.patterns.iterator;

/**
 * 菜单
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:16:08
 */
public class MenuItem {
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
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

}
