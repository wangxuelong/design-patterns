/**
 * 
 */
package com.wxl.design.patterns.proxy.v1;

/**
 *
 * @author Wang XueLong
 * @Date 2017年2月27日 下午1:06:42
 */
public class GumballMachineTestDriver {
	public static void main(String[] args) {
		args = new String[] { "Seattle", "12" };
		int count = 0;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}

		count = Integer.parseInt(args[1]);

		GumballMachine gumballMachine = new GumballMachine(args[0], count);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		monitor.report();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		monitor.report();
	}
}
