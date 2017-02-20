/**
 * 
 */
package com.wxl.design.patterns.iterator.v2;

import java.util.Iterator;

import com.wxl.design.patterns.iterator.MenuItem;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:39:40
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] items;
	int position = 0;

	/**
	 * @param items
	 */
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
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
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalArgumentException("You can't remove an item until you've done at last on next()");
		}

		if (items[position - 1] != null) {
			for (int i = position - 1; i < items.length; i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
}
