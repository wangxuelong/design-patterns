/**
 * 
 */
package com.wxl.design.patterns.observer.weather;

/**
 * 天气主题
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午4:41:28
 */
public interface Subject {
	/**
	 * 注册观察者
	 * 
	 * @param observer
	 */
	void registerObserver(Observer observer);

	/**
	 * 移除观察者
	 * 
	 * @param observer
	 */
	void removeObserver(Observer observer);

	/**
	 * 通知观察者
	 * 
	 */
	void notifyObservers();
}
