/**
 * 
 */
package com.wxl.design.patterns.strategy.game;

import com.wxl.design.patterns.strategy.game.weapon.impl.SwordBehavior;

/**
 * 国王
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:09:03
 */
public class King extends Character {

	/**
	 * 
	 */
	public King() {
		super.weapon = new SwordBehavior();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.strategy.game.Character#fight()
	 */
	@Override
	public void fight() {
		System.out.print("国王");
		weapon.useWeapon();
	}
}
