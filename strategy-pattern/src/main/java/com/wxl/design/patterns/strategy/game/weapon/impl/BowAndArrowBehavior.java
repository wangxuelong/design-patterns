/**
 * 
 */
package com.wxl.design.patterns.strategy.game.weapon.impl;

import com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior;

/**
 * 弓箭武器行为
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:12:38
 */
public class BowAndArrowBehavior implements WeaponBehavior {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("使用弓箭刺杀");

	}

}
