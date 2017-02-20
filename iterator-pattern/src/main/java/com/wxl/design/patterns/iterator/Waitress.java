/**
 * 
 */
package com.wxl.design.patterns.iterator;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:43:11
 */
public class Waitress {
	private DinerMenu dinerMenu;
	private PancakeHouseMenu pancakeHouseMenu;

	/**
	 * @param dinerMenu
	 * @param pancakeHouseMenu
	 */
	public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
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
		Iterator iterator = dinerMenu.createIterator();
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
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
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
