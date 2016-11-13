/**
 * 
 */
package com.wxl.design.patterns.observer.weather.impl;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather.Observer;
import com.wxl.design.patterns.observer.weather.Subject;

/**
 * 天气预告布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:10:24
 */
public class ForecastDisplay implements DisplayElement, Observer {
	private Subject weatherData;
	/**
	 * 气压
	 */
	private float pressure;

	/**
	 * @param subject
	 */
	public ForecastDisplay(Subject weatherData) {
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
		// 显示天气预报
		System.out.print("Forecast conditions:");
		System.out.println(pressure + "Pa pressure");
		System.out.println();
	}

}
