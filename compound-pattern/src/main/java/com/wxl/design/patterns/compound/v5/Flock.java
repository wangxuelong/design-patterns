/**
 * 
 */
package com.wxl.design.patterns.compound.v5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wxl.design.patterns.compound.v1.Quackable;

/**
 * 鸭群
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午10:01:49
 */
public class Flock implements Quackable {
	private List<Quackable> quackers = new ArrayList<Quackable>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v1.Quackable#quack()
	 */
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}

}
