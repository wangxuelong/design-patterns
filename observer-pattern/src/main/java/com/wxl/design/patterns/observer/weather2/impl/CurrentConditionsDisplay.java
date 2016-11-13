/**
 * 
 */
package com.wxl.design.patterns.observer.weather2.impl;

import java.util.Observable;
import java.util.Observer;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather2.WeatherData;

/**
 * 当前状况布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:05:37
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Observable observable;
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
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			this.display();
		}

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
