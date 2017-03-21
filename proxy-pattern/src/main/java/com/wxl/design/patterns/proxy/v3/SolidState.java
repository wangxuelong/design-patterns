/**
 * 
 */
package com.wxl.design.patterns.proxy.v3;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午10:16:07
 */
public class SolidState implements State {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5007692542801451437L;
	transient GumballMachine gumballMachine;

	/**
	 * @param gumballMachine
	 */
	public SolidState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#dispense()
	 */
	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
