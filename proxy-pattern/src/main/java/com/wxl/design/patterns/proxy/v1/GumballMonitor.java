/**
 * 
 */
package com.wxl.design.patterns.proxy.v1;

/**
 * 糖果监视器
 * 
 * @author Wang XueLong
 * @Date 2017年2月27日 下午1:07:07
 */
public class GumballMonitor {

	private GumballMachine machine;

	/**
	 * @param machine
	 */
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("Gumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount());
		System.out.println("Current state: " + machine.getState());
		System.out.println();
	}

}
