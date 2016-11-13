/**
 * 
 */
package com.wxl.design.patterns.strategy.game;

import com.wxl.design.patterns.strategy.game.weapon.impl.KnifeBehavior;

/**
 * 妖怪
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:09:45
 */
public class Troll extends Character {

	/**
	 * 
	 */
	public Troll() {
		super.weapon = new KnifeBehavior();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.strategy.game.Character#fight()
	 */
	@Override
	public void fight() {
		System.out.print("妖怪");
		weapon.useWeapon();
	}

}
