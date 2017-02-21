/**
 * 
 */
package com.wxl.design.patterns.composite.v1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月21日 下午9:59:10
 */
public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;

	/**
	 * @param name
	 * @param description
	 */
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.composite.v1.MenuComponent#add(com.wxl.design
	 * .patterns.composite.v1.MenuComponent)
	 */
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.composite.v1.MenuComponent#remove(com.wxl.design
	 * .patterns.composite.v1.MenuComponent)
	 */
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.composite.v1.MenuComponent#getChild(int)
	 */
	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.composite.v1.MenuComponent#print()
	 */
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.composite.v1.MenuComponent#createIterator()
	 */
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new ComponenIterator(menuComponents.iterator());
	}

}
