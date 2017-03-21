/**
 * 
 */
package com.wxl.design.patterns.proxy.v1;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午10:17:18
 */
public class SolidOutState implements State {
	GumballMachine gumballMachine;

	/**
	 * @param gumballMachine
	 */
	public SolidOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a querter yet");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
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
