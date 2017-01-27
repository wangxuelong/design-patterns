/**
 * 
 */
package com.wxl.design.patterns.singleton;

/**
 * 单件（单例）模式
 * 
 * @author Wang XueLong
 * @Date 2017年1月26日 上午11:40:30
 */
public class Singleton {
	/**
	 * 利用一个静态变量来记录Singleton唯一实例
	 */
	private volatile static Singleton uniquieInstance;

	/**
	 * 私有化构造函数，只有自Singleton类内才可以调用构造器
	 */
	private Singleton() {
	}

	/**
	 * 使用静态获取实例对象
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		// 延迟初始化
		if (uniquieInstance == null) {
			// 双重检查锁，只有在第一次uniquieInstance为空时进入，减少使用 synchronized 在
			// getInstance() 上的性能损耗。
			synchronized (Singleton.class) {
				if (uniquieInstance == null) {
					uniquieInstance = new Singleton();
				}
			}
		}
		return uniquieInstance;
	}
}
