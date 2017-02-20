/**
 * 
 */
package com.wxl.design.patterns.iterator.v3;

import java.util.Iterator;

import com.wxl.design.patterns.iterator.MenuItem;
import com.wxl.design.patterns.iterator.v2.Menu;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:43:11
 */
public class Waitress {
	private Menu dinerMenu;
	private Menu pancakeHouseMenu;
	private Menu cafeMenu;

	/**
	 * @param dinerMenu
	 * @param pancakeHouseMenu
	 */
	public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.cafeMenu = cafeMenu;
	}

	/**
	 * 打印出菜单上的每一项
	 */
	public void printMenu() {
		System.out.println("MENU\n----\nBREAKFAST");
		// MenuItem[] dinerMenuItems = dinerMenu.getMenuItems();
		// for (int i = 0; i < dinerMenuItems.length; i++) {
		// MenuItem item = dinerMenuItems[i];
		// System.out.print(item.getName() + " ");
		// System.out.print(item.getPrice() + " ");
		// System.out.println(item.getDescription() + " ");
		// }
		Iterator<MenuItem> iterator = dinerMenu.createIterator();
		printMenu(iterator);

		System.out.println("\nLUNCH");
		// ArrayList<MenuItem> pancakeHouseMenuItems =
		// pancakeHouseMenu.getMenuItems();
		// for (int i = 0; i < pancakeHouseMenuItems.size(); i++) {
		// MenuItem item = pancakeHouseMenuItems.get(i);
		// System.out.print(item.getName() + " ");
		// System.out.print(item.getPrice() + " ");
		// System.out.println(item.getDescription() + " ");
		// }
		iterator = pancakeHouseMenu.createIterator();
		printMenu(iterator);

		System.out.println("\nDINNER");
		iterator = cafeMenu.createIterator();
		printMenu(iterator);
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
