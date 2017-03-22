/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 * 观察者
 * 
 * @author Wang XueLong
 * @Date 2017年3月27日 下午9:16:58
 */
public interface Observer {
	/**
	 * 呱呱叫
	 * 
	 * @param duck
	 */
	public void update(QuackObservable duck);
}
