/**
 * 
 */
package com.wxl.design.patterns.iterator;

import java.util.ArrayList;

/**
 * 煎饼屋菜单
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:20:37
 */
public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;

	/**
	 * @param items
	 */
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with you choice blueberries or strawberries", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	/**
	 * @return the menuItems
	 */
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
