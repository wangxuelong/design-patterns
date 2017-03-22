/**
 * 
 */
package com.wxl.design.patterns.compound.v5;

import com.wxl.design.patterns.compound.v1.Quackable;
import com.wxl.design.patterns.compound.v2.Goose;
import com.wxl.design.patterns.compound.v2.GooseAdapter;
import com.wxl.design.patterns.compound.v3.QuackCounter;
import com.wxl.design.patterns.compound.v4.AbstractDuckFactory;
import com.wxl.design.patterns.compound.v4.CountingDuckFactory;

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
		simulator.simulate(duckFactory);
	}

	/**
	 * 
	 */
	public DuckSimulator() {
	}

	void simulate(AbstractDuckFactory duckFactory) {
		// 使用新的装饰者包装鸭叫
		Quackable redheatDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		// 不统计鹅叫，不装饰
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simualtor： With Composite - Flocks");
		// 鸭群
		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheatDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		// 绿头鸭群
		Flock flockOfMallards = new Flock();
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		// 将绿头鸭加入鸭群
		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simualtor: Whole Flock Simualtor");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simualtor: Mallard Flock Simualtor");
		simulate(flockOfMallards);

		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
