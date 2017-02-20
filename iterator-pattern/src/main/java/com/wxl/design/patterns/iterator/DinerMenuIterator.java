/**
 * 
 */
package com.wxl.design.patterns.iterator;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午8:39:40
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	int position = 0;

	/**
	 * @param menuItems
	 */
	public DinerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (position >= menuItems.length || menuItems[position] == null) {
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
		MenuItem menuItem = menuItems[position];
		position += 1;
		return menuItem;
	}
}
