/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 * 被观察对象
 * 
 * 呱呱叫
 * 
 * @author Wang XueLong
 * @Date 2017年3月27日 下午9:06:57
 */
public interface QuackObservable {

	/**
	 * 注册观察者
	 * 
	 * @param observer
	 */
	public void regiestObservable(Observer observer);

	/**
	 * 通知所有观察者
	 */
	public void notifyObservers();
}
