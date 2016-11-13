/**
 * 
 */
package com.wxl.design.patterns.observer.weather2.impl;

import java.util.Observable;
import java.util.Observer;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather2.WeatherData;

/**
 * 第三方布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:11:25
 */
public class ThirdPartyDisplay implements DisplayElement, Observer {
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
	 * 气压
	 */
	private float pressure;

	/**
	 * @param weatherData
	 */
	public ThirdPartyDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	private void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
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
			float temperature = data.getTemperature();
			float humidity = data.getHumidity();
			float pressure = data.getPressure();

			this.update(temperature, humidity, pressure);
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
		System.out.print("ThirdParty conditions:");
		System.out.print(temperature + "F degress and ");
		System.out.print(humidity + "% humidity and ");
		System.out.println(pressure + "Pa pressure");
		System.out.println();
	}

}
