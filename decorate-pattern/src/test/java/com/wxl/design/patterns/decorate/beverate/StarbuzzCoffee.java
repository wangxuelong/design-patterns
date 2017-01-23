/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate;

import com.wxl.design.patterns.decorate.beverate.condiment.Mocha;
import com.wxl.design.patterns.decorate.beverate.condiment.Soy;
import com.wxl.design.patterns.decorate.beverate.condiment.Whip;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:47:33
 */
public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverate beverate = new Espresso();
		System.out.println(beverate.getDescription() + " $" + beverate.cost());

		Beverate beverate2 = new DarkRoast();
		beverate2 = new Mocha(beverate2);
		beverate2 = new Mocha(beverate2);
		beverate2 = new Whip(beverate2);
		System.out.println(beverate2.getDescription() + " $" + beverate2.cost());

		Beverate beverate3 = new HouseBlend();
		beverate3 = new Soy(beverate3);
		beverate3 = new Mocha(beverate3);
		beverate3 = new Whip(beverate3);
		System.out.println(beverate3.getDescription() + " $" + beverate3.cost());
	}

}
