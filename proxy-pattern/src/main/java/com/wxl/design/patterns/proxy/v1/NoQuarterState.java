/**
 * 
 */
package com.wxl.design.patterns.proxy.v1;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午10:17:36
 */
public class NoQuarterState implements State {

	GumballMachine gumballMachine;

	/**
	 * @param gumballMachine
	 */
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#turnCrank()
	 */
	@Override
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.state.v2.State#dispense()
	 */
	@Override
	public void dispense() {
		System.out.println("You need pay first");
	}

}
