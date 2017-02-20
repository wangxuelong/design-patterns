/**
 * 
 */
package com.wxl.design.patterns.iterator;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午9:03:16
 */
public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
		waitress.printMenu();
	}
}
