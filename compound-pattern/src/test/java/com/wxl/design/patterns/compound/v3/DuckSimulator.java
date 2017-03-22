/**
 * 
 */
package com.wxl.design.patterns.compound.v3;

import com.wxl.design.patterns.compound.v1.DuckCall;
import com.wxl.design.patterns.compound.v1.MallardDuck;
import com.wxl.design.patterns.compound.v1.Quackable;
import com.wxl.design.patterns.compound.v1.RedheadDuck;
import com.wxl.design.patterns.compound.v1.RubberDuck;
import com.wxl.design.patterns.compound.v2.Goose;
import com.wxl.design.patterns.compound.v2.GooseAdapter;

/**
 * 鸭子模拟器
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:29:33
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	/**
	 * 
	 */
	public DuckSimulator() {
	}

	void simulate() {
		// 使用新的装饰者包装鸭叫
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheatDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		// 不统计鹅叫，不装饰
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simualtor： With Decorator");
		simulate(mallardDuck);
		simulate(redheatDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
