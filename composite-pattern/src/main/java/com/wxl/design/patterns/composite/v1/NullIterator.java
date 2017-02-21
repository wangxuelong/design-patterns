/**
 * 
 */
package com.wxl.design.patterns.composite.v1;

import java.util.Iterator;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月21日 下午10:30:16
 */
public class NullIterator implements Iterator<MenuComponent> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public MenuComponent next() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
