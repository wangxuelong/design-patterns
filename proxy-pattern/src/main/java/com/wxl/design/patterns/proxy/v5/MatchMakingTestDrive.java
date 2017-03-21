/**
 * 
 */
package com.wxl.design.patterns.proxy.v5;

import java.lang.reflect.Proxy;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午9:54:29
 */
public class MatchMakingTestDrive {
	public static void main(String[] args) {
		MatchMakingTestDrive drive = new MatchMakingTestDrive();
		drive.drive();
	}

	/**
	 * 
	 */
	public MatchMakingTestDrive() {
	}

	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		PersonBean ownerPorxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerPorxy.getName());
		ownerPorxy.setInterests("bowing, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerPorxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerPorxy.getHotOrNotRating());

		PersonBean nonOwnerPorxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerPorxy.getName());
		try {
			nonOwnerPorxy.setInterests("bowing, Go");
			System.out.println("Interests set from owner proxy");
		} catch (Exception e) {
			System.out.println("Can't set interests from owner proxy");
		}
		nonOwnerPorxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerPorxy.getHotOrNotRating());
	}

	/**
	 * @param joe
	 * @return
	 */
	private PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	/**
	 * @param person
	 * @return
	 */
	private PersonBean getOwnerProxy(PersonBean person) {
		Object proxy = Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
		return (PersonBean) proxy;
	}

	/**
	 * @param name
	 * @return
	 */
	private PersonBean getPersonFromDatabase(String name) {
		PersonBean person = new PersonBeanImpl();
		person.setName(name);
		person.setGender("Man");
		person.setInterests("PingPang");
		person.setHotOrNotRating(5);
		return person;
	}
}
