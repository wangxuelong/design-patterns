/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 * 呱呱叫
 * 
 * @author Wang XueLong
 * @Date 2017年3月27日 下午9:10:43
 */
public interface Quackable extends QuackObservable {
	/**
	 * 呱呱叫
	 */
	public void quack();
}
