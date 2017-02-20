/**
 * 
 */
package com.wxl.design.patterns.iterator.v2;

import java.util.Iterator;

import com.wxl.design.patterns.iterator.MenuItem;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月20日 下午9:16:13
 */
public interface Menu {
	public Iterator<MenuItem> createIterator();
}
