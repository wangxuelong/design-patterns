/**
 * 
 */
package com.wxl.design.patterns.proxy.v3;

import java.rmi.Naming;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月15日 下午9:31:26
 */
public class GumballMachineTestDriver {
	public static void main(String[] args) {
		args = new String[] { "127.0.0.1", "100" };
		GumballMachineRemote gumballMachine = null;
		int count;
		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(0);
		}

		try {
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.bind("//" + args[0] + "/gumballMachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
