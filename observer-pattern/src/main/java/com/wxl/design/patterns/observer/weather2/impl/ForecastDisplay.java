/**
 * 
 */
package com.wxl.design.patterns.observer.weather2.impl;

import java.util.Observable;
import java.util.Observer;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather2.WeatherData;

/**
 * 天气预告布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:10:24
 */
public class ForecastDisplay implements DisplayElement, Observer {
	private Observable observable;
	/**
	 * 气压
	 */
	private float pressure;

	/**
	 * @param subject
	 */
	public ForecastDisplay(Observable observable) {
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
			this.pressure = data.getPressure();
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
		// 显示天气预报
		System.out.print("Forecast conditions:");
		System.out.println(pressure + "Pa pressure");
		System.out.println();
	}

}
