/**
 * 
 */
package com.wxl.design.patterns.observer.weather;

/**
 * 天气观察者 接口
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午4:41:41
 */
public interface Observer {
	/**
	 * 数据改变
	 * 
	 * @param temperature
	 *            温度
	 * @param humidity
	 *            湿度
	 * @param pressure
	 *            气压
	 */
	void update(float temperature, float humidity, float pressure);
}
