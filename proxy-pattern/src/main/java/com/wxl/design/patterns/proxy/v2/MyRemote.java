/**
 * 
 */
package com.wxl.design.patterns.proxy.v2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月15日 下午9:03:54
 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
