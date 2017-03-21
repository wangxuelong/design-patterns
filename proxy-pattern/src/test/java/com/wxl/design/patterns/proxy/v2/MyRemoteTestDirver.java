/**
 * 
 */
package com.wxl.design.patterns.proxy.v2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月15日 下午9:20:52
 */
public class MyRemoteTestDirver {
	public static void main(String[] args) {
		try {
			MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			System.out.println(myRemote.sayHello());
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
