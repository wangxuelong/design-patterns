/**
 * 
 */
package com.wxl.design.patterns.composite.v1;

import java.util.Iterator;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:43:11
 */
public class Waitress {
	MenuComponent allMenus;

	/**
	 * @param allMenus
	 */
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	/**
	 * 打印出菜单上的每一项
	 */
	public void printMenu() {
		allMenus.print();
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
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
			}
		}
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
