/**
 * 
 */
package com.wxl.design.patterns.iterator.v4;

import java.util.ArrayList;

import com.wxl.design.patterns.iterator.v2.DinerMenu;
import com.wxl.design.patterns.iterator.v2.Menu;
import com.wxl.design.patterns.iterator.v2.PancakeHouseMenu;
import com.wxl.design.patterns.iterator.v3.CafeMenu;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午9:03:16
 */
public class MenuTestDrive {
	public static void main(String[] args) {
		ArrayList<Menu> menus = new ArrayList<Menu>();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		menus.add(pancakeHouseMenu);
		DinerMenu dinerMenu = new DinerMenu();
		menus.add(dinerMenu);
		CafeMenu cafeMenu = new CafeMenu();
		menus.add(cafeMenu);

		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
