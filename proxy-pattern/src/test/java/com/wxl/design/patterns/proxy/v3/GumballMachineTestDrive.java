/**
 * 
 */
package com.wxl.design.patterns.proxy.v3;

import java.rmi.Naming;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午8:26:14
 */
public class GumballMachineTestDrive {
	public static void main(String[] args) {
		String[] location = { "rmi://127.0.0.1/gumballMachine" };
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		for (int i = 0; i < location.length; i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
