/**
 * 
 */
package com.wxl.design.patterns.proxy.v1;

import java.util.Random;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午10:17:45
 */
public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;

	/**
	 * @param gumballMachine
	 */
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("Quarter return");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#dispense()
	 */
	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
