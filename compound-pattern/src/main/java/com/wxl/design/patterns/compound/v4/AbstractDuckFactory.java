/**
 * 
 */
package com.wxl.design.patterns.compound.v4;

import com.wxl.design.patterns.compound.v1.Quackable;

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

	/**
	 * 创建红头鸭
	 * 
	 * @return
	 */
	public abstract Quackable createRedheadDuck();

	/**
	 * 创建鸭鸣器
	 * 
	 * @return
	 */
	public abstract Quackable createDuckCall();

	/**
	 * 创建橡皮鸭
	 * 
	 * @return
	 */
	public abstract Quackable createRubberDuck();
}
