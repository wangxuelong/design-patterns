/**
 * 
 */
package com.wxl.design.patterns.strategy.game;

import com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior;

/**
 * 角色
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:04:31
 */
public abstract class Character {
	WeaponBehavior weapon;

	/**
	 * 战斗
	 */
	public abstract void fight();

	/**
	 * @param weapon
	 *            the weapon to set
	 */
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

}
