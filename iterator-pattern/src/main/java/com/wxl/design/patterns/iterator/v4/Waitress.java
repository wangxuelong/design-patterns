/**
 * 
 */
package com.wxl.design.patterns.iterator.v4;

import java.util.Iterator;
import java.util.List;

import com.wxl.design.patterns.iterator.MenuItem;
import com.wxl.design.patterns.iterator.v2.Menu;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:43:11
 */
public class Waitress {
	List<Menu> menus;

	/**
	 * @param menus
	 */
	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	/**
	 * 打印出菜单上的每一项
	 */
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem item = iterator.next();
			System.out.print(item.getName() + ", ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}

	/**
	 * 打印早餐项
	 */
	public void printBreakfastMenu() {

	}

	/**
	 * 打印午餐项
	 */
	public void printLunchMenu() {

	}

	/**
	 * 打印所有素菜项
	 */
	public void printVegetarianMenu() {

	}

	/**
	 * 是否素菜
	 * 
	 * @param name
	 *            菜单名称
	 * @return
	 */
	public boolean isItemVegetarian(String name) {
		return false;
	}
}
