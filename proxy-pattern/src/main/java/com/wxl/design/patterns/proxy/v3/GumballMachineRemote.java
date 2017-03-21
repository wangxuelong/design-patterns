/**
 * 
 */
package com.wxl.design.patterns.proxy.v3;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月15日 下午9:25:27
 */
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;

	public String getLocation() throws RemoteException;

	public State getState() throws RemoteException;
}
