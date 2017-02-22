/**
 * 
 */
package com.wxl.design.patterns.state.v1;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午9:31:20
 */
public class GumballMachine {
	/**
	 * 糖果售馨
	 */
	public static final int SOLD_OUT = 0;
	/**
	 * 没有25分钱
	 */
	public static final int NO_QUARTER = 1;
	/**
	 * 有25分钱
	 */
	public static final int HAS_QUARTE = 2;
	/**
	 * 售出糖果
	 */
	public static final int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	/**
	 * @param count
	 */
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	/**
	 * 投入25分钱
	 */
	public void insertQuarter() {
		if (state == HAS_QUARTE) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTE;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		}
	}

	/**
	 * 退回25分钱
	 */
	public void ejectQuarter() {
		if (state == HAS_QUARTE) {
			System.out.println("Quarter return");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a querter yet");
		}
	}

	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You turned, but there's no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} else if (state == HAS_QUARTE) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		}
	}

	/**
	 * 分配糖果
	 */
	public void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			count = count - 1;
			if (count == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTE) {
			System.out.println("No gumball dispensed");
		}
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
		if (state == NO_QUARTER) {
			sb.append("Machine is waiting for quarter");
		} else if (state == SOLD_OUT) {
			sb.append("Machine is solid out");
		}
		sb.append("\n");
		return sb.toString();
	}
}
