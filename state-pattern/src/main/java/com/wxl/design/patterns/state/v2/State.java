/**
 * 
 */
package com.wxl.design.patterns.state.v2;

/**
 * 糖果机状态
 * 
 * @author Wang XueLong
 * @Date 2017年2月22日 下午10:14:50
 */
public interface State {

	/**
	 * 投入25分钱
	 */
	public void insertQuarter();

	/**
	 * 退回25分钱
	 */
	public void ejectQuarter();

	/**
	 * 转动曲柄
	 */
	public void turnCrank();

	/**
	 * 分配糖果
	 */
	public void dispense();

}
