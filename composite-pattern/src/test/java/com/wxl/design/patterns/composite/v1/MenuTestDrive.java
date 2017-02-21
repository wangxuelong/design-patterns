/**
 * 
 */
package com.wxl.design.patterns.composite.v1;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月21日 下午10:05:17
 */
public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfase");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

		MenuComponent allMenus = new Menu("ALL MENUS", "ALL menus combined");

		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with you choice blueberries or strawberries", true, 3.59));
		allMenus.add(pancakeHouseMenu);

		dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
		dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
		dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05));
		allMenus.add(dinerMenu);

		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
		cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
		cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));
		allMenus.add(cafeMenu);

		dinerMenu.add(new MenuItem("Paste", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();

		waitress.printVegetarianMenu();
	}
}
