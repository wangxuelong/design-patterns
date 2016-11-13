/**
 * 
 */
package com.wxl.design.patterns.strategy.duck;

import com.wxl.design.patterns.strategy.duck.Duck;
import com.wxl.design.patterns.strategy.duck.MallardDuck;
import com.wxl.design.patterns.strategy.duck.ModelDuck;
import com.wxl.design.patterns.strategy.duck.fly.impl.FlyRocketPowered;

/**
 * 小鸭子模拟器
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午2:02:47
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
