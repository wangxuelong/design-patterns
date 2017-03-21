/**
 * 
 */
package com.wxl.design.patterns.proxy.v5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午9:49:17
 */
public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean person;

	/**
	 * @param person
	 */
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new Exception();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
