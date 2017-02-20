/**
 * 
 */
package com.wxl.design.patterns.iterator.v3;

import com.wxl.design.patterns.iterator.v2.DinerMenu;
import com.wxl.design.patterns.iterator.v2.PancakeHouseMenu;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午9:03:16
 */
public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);
		waitress.printMenu();
	}
}
