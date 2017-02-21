/**
 * 
 */
package com.wxl.design.patterns.composite.v1;

import java.util.Iterator;

/**
 * 菜单组件
 * 
 * @author Wang XueLong
 * @Date 2017年2月21日 下午9:51:17
 */
public abstract class MenuComponent {
	/**
	 * 添加
	 * 
	 * @param menuComponent
	 */
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 移除
	 * 
	 * @param menuComponent
	 */
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 获取子菜单组件
	 * 
	 * @param i
	 *            菜单组件下标
	 * @return
	 */
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 获取名称
	 * 
	 * @return
	 */
	public String getName() {
		throw new UnsupportedOperationException();

	}

	/**
	 * 获取描述
	 * 
	 * @return
	 */
	public String getDescription() {
		throw new UnsupportedOperationException();

	}

	/**
	 * 获取价格
	 * 
	 * @return
	 */
	public double getPrice() {
		throw new UnsupportedOperationException();

	}

	/**
	 * 是否素食
	 * 
	 * @return
	 */
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 打印菜单
	 */
	public void print() {
		throw new UnsupportedOperationException();
	}

	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}
}
