/**
 * 
 */
package com.wxl.design.patterns.iterator.v3;

import java.util.Hashtable;
import java.util.Iterator;

import com.wxl.design.patterns.iterator.MenuItem;
import com.wxl.design.patterns.iterator.v2.Menu;

/**
 * 咖啡餐厅
 * 
 * @author Wang XueLong
 * @Date 2017年2月21日 下午9:25:05
 */
public class CafeMenu implements Menu {
	Hashtable<String, MenuItem> items = new Hashtable<String, MenuItem>();

	/**
	 * @param items
	 */
	public CafeMenu() {
		addItem("Veggie Burger and Air Fries", "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
		addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		items.put(menuItem.getName(), menuItem);
	}

	/**
	 * @return the items
	 */
	// public Hashtable<String, MenuItem> getItems() {
	// return items;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.iterator.v2.Menu#createIterator()
	 */
	@Override
	public Iterator<MenuItem> createIterator() {
		return items.values().iterator();
	}

}
