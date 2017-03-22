/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

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
		// 鸭群
		Flock flockOfDucks = new Flock();

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

		System.out.println("\nDuck Simualtor： With Observable");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.regiestObservable(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
