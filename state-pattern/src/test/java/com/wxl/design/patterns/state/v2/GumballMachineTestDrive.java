/**
 * 
 */
package com.wxl.design.patterns.state.v2;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午9:51:47
 */
public class GumballMachineTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}

}
