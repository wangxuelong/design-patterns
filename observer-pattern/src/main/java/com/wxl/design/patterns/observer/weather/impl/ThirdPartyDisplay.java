/**
 * 
 */
package com.wxl.design.patterns.observer.weather.impl;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather.Observer;
import com.wxl.design.patterns.observer.weather.Subject;

/**
 * 第三方布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:11:25
 */
public class ThirdPartyDisplay implements DisplayElement, Observer {
	private Subject weatherData;

	/**
	 * 温度
	 */
	private float temperature;
	/**
	 * 湿度
	 */
	private float humidity;
	/**
	 * 气压
	 */
	private float pressure;

	/**
	 * @param weatherData
	 */
	public ThirdPartyDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.observer.weather.Observer#update(float,
	 * float, float)
	 */
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.observer.weather.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.print("ThirdParty conditions:");
		System.out.print(temperature + "F degress and ");
		System.out.print(humidity + "% humidity and ");
		System.out.println(pressure + "Pa pressure");
		System.out.println();
	}

}
