/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 * 鸭子抽象工厂
 * 
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:49:44
 */
public abstract class AbstractDuckFactory {
	/**
	 * 创建绿头鸭
	 * 
	 * @return
	 */
	public abstract Quackable createMallardDuck();

}
