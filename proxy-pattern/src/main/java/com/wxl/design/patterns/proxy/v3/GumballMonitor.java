/**
 * 
 */
package com.wxl.design.patterns.proxy.v3;

import java.rmi.RemoteException;

/**
 * 糖果监视器
 * 
 * @author Wang XueLong
 * @Date 2017年2月27日 下午1:07:07
 */
public class GumballMonitor {

	private GumballMachineRemote machine;

	/**
	 * @param machine
	 */
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}

	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount());
			System.out.println("Current state: " + machine.getState());
			System.out.println();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
