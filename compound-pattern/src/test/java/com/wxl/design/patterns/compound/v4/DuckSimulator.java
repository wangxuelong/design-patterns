/**
 * 
 */
package com.wxl.design.patterns.compound.v4;

import com.wxl.design.patterns.compound.v1.Quackable;
import com.wxl.design.patterns.compound.v2.Goose;
import com.wxl.design.patterns.compound.v2.GooseAdapter;
import com.wxl.design.patterns.compound.v3.QuackCounter;

/**
 * 鸭子模拟器
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:29:33
 */
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		// duckFactory = new DuckFactory();
		simulator.simulate(duckFactory);
	}

	/**
	 * 
	 */
	public DuckSimulator() {
	}

	void simulate(AbstractDuckFactory duckFactory) {
		// 使用新的装饰者包装鸭叫
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheatDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		// 不统计鹅叫，不装饰
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simualtor： With Abstract Factory");
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
