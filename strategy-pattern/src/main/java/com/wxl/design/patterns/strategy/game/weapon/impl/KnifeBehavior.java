/**
 * 
 */
package com.wxl.design.patterns.strategy.game.weapon.impl;

import com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior;

/**
 * 匕首 武器的行为
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:11:41
 */
public class KnifeBehavior implements WeaponBehavior {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("使用匕首刺杀！");
	}

}
