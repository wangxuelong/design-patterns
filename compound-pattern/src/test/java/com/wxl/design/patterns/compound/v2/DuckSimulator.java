/**
 * 
 */
package com.wxl.design.patterns.compound.v2;

import com.wxl.design.patterns.compound.v1.DuckCall;
import com.wxl.design.patterns.compound.v1.MallardDuck;
import com.wxl.design.patterns.compound.v1.Quackable;
import com.wxl.design.patterns.compound.v1.RedheadDuck;
import com.wxl.design.patterns.compound.v1.RubberDuck;

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
		Quackable mallardDuck = new MallardDuck();
		Quackable redheatDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simualtor: With Goose Adapter");
		simulate(mallardDuck);
		simulate(redheatDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
