/**
 * 
 */
package com.wxl.design.patterns.iterator;

import java.util.ArrayList;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:51:53
 */
public class PancakeHouseMenuIterator implements Iterator {

	private ArrayList<MenuItem> items;
	private int position = 0;

	/**
	 * @param items
	 */
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		MenuItem item = items.get(position);
		position += 1;
		// TODO Auto-generated method stub
		return item;
	}

}
