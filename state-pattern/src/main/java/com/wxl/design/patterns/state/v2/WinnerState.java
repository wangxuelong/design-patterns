/**
 * 
 */
package com.wxl.design.patterns.state.v2;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午10:18:04
 */
public class WinnerState implements State {
	GumballMachine gumballMachine;

	/**
	 * @param gumballMachine
	 */
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("You're not a winner!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("You're not a winner!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		System.out.println("You're not a winner!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#dispense()
	 */
	@Override
	public void dispense() {
		System.out.println("YOU'RE A WINNER! You get two gumball for your quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

}
