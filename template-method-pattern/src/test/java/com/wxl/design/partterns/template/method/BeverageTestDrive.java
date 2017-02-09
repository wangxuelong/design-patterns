/**
 * 
 */
package com.wxl.design.partterns.template.method;

import com.wxl.design.partterns.template.method.hook.CoffeeWithHook;
import com.wxl.design.partterns.template.method.hook.TeaWithHook;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:50:30
 */
public class BeverageTestDrive {
	public static void main(String[] args) {
		TeaWithHook tea = new TeaWithHook();
		CoffeeWithHook coffee = new CoffeeWithHook();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffee");
		coffee.prepareRecipe();
	}
}
