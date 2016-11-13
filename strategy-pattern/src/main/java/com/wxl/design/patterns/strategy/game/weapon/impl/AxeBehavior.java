/**
 * 
 */
package com.wxl.design.patterns.strategy.game.weapon.impl;

import com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior;

/**
 * 斧头攻击
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:13:42
 */
public class AxeBehavior implements WeaponBehavior {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior#useWeapon()
	 */
	@Override
	public void useWeapon() {
		System.out.println("使用斧头劈砍！");

	}

}
