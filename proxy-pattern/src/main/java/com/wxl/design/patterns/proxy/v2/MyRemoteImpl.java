/**
 * 
 */
package com.wxl.design.patterns.proxy.v2;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月15日 下午9:05:22
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	/**
	 * @throws RemoteException
	 */
	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = -8399941419168988100L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v2.MyRemote#sayHello()
	 */
	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}

	public static void main(String[] args) {
		try {
			MyRemote myRemote = new MyRemoteImpl();
			Naming.bind("RemoteHello", myRemote);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}

}
