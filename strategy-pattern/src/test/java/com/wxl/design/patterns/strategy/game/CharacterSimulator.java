/**
 * 
 */
package com.wxl.design.patterns.strategy.game;

import com.wxl.design.patterns.strategy.game.weapon.WeaponBehavior;
import com.wxl.design.patterns.strategy.game.weapon.impl.KnifeBehavior;

/**
 * 角色
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午3:16:37
 */
public class CharacterSimulator {
	public static void main(String[] args) {
		Character king = new King();
		king.fight();

		WeaponBehavior knify = new KnifeBehavior();
		king.setWeapon(knify);
		king.fight();
	}
}
