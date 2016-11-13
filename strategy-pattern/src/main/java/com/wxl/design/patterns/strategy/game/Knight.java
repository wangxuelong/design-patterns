/**
 * 
 */
package com.wxl.design.patterns.strategy.game;

import com.wxl.design.patterns.strategy.game.weapon.impl.AxeBehavior;

/**
 * 骑士
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:10:31
 */
public class Knight extends Character {

	/**
	 * 
	 */
	public Knight() {
		super.weapon = new AxeBehavior();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.strategy.game.Character#fight()
	 */
	@Override
	public void fight() {
		System.out.print("骑士");
		weapon.useWeapon();
	}

}
