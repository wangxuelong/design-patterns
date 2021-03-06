/**
 * 
 */
package com.wxl.design.patterns.proxy.v3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午9:31:20
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	private static final long serialVersionUID = -8827051632799704853L;

	/**
	 * 地址
	 */
	private String location;

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winnerState;
	private State state = soldOutState;
	private int count = 0;

	/**
	 * @param count
	 */
	public GumballMachine(String location, int numberGumballs) throws RemoteException {
		this.count = numberGumballs;
		this.location = location;
		soldOutState = new SolidOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SolidState(this);
		winnerState = new WinnerState(this);
		if (count > 0) {
			state = noQuarterState;
		}
	}

	/**
	 * 投入25分钱
	 */
	public void insertQuarter() {
		state.insertQuarter();
	}

	/**
	 * 退回25分钱
	 */
	public void ejectQuarter() {
		state.ejectQuarter();
	}

	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot");
		if (count != 0) {
			count = count - 1;
		}
	}

	/**
	 * 重新装填
	 * 
	 * @param count
	 */
	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	/**
	 * @return the winnerState
	 */
	public State getWinnerState() {
		return winnerState;
	}

	/**
	 * @return the state
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * 地址
	 * 
	 * @return the location
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * @return the count
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nMighty Gumball, Inc.\n");
		sb.append("Java-enable Standing Gumball Model #2004\n");
		sb.append("Invetory: " + count + " gumballs\n");
		if (state == noQuarterState) {
			sb.append("Machine is waiting for quarter");
		} else if (state == soldOutState) {
			sb.append("Machine is solid out");
		}
		sb.append("\n");
		return sb.toString();
	}
}
