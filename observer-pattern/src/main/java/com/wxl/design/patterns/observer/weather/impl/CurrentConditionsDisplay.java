/**
 * 
 */
package com.wxl.design.patterns.observer.weather.impl;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather.Observer;
import com.wxl.design.patterns.observer.weather.Subject;

/**
 * 当前状况布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:05:37
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
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
	 * 
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
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
		this.display();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.observer.weather.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.print("Current conditions:");
		System.out.print(temperature + "F degress and ");
		System.out.println(humidity + "% humidity");
		System.out.println();
	}

}
