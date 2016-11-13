/**
 * 
 */
package com.wxl.design.patterns.strategy.game;

import com.wxl.design.patterns.strategy.game.weapon.impl.BowAndArrowBehavior;

/**
 * 皇后
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:06:01
 */
public class Queen extends Character {

	/**
	 * 
	 */
	public Queen() {
		this.weapon = new BowAndArrowBehavior();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.strategy.game.Character#fight()
	 */
	@Override
	public void fight() {
		System.out.print("皇后");
		weapon.useWeapon();
	}

}
