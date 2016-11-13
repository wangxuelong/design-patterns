/**
 * 
 */
package com.wxl.design.patterns.observer.weather2.impl;

import java.util.Observable;
import java.util.Observer;

import com.wxl.design.patterns.observer.weather.DisplayElement;
import com.wxl.design.patterns.observer.weather2.WeatherData;

/**
 * 统计布告板
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午5:08:54
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	private Observable observable;
	/**
	 * 温度
	 */
	private float minTemperature;
	private float maxTemperature;
	private float avgTemperature;
	/**
	 * 湿度
	 */
	private float minHumidity;
	private float maxHumidity;
	private float avgHumidity;

	/**
	 * 气压
	 */
	private float minPressure;
	private float maxPressure;
	private float avgPressure;

	/**
	 * 
	 */
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.observer.weather.DisplayElement#display()
	 */
	@Override
	public void display() {
		// 显示最小、平均和最大的观察值
		System.out.println("Statistics conditions:");
		System.out.println("	Temperature Max:" + this.maxTemperature + "F Avg:" + this.avgTemperature + "F Min:" + this.minTemperature + "F");
		System.out.println("	Humidity Max:" + this.maxHumidity + "% Avg:" + this.avgHumidity + "% Min:" + this.minHumidity + "%");
		System.out.println("	Pressure Max:" + this.maxPressure + "Pa Avg:" + this.avgPressure + "Pa Min:" + this.minPressure + "Pa");

		System.out.println();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.observer.weather.Observer#update(float,
	 * float, float)
	 */
	private void update(float temperature, float humidity, float pressure) {
		this.avgTemperature = this.avgTemperature == 0 ? temperature : this.avgTemperature;
		this.minTemperature = this.minTemperature == 0 ? temperature : this.minTemperature;
		this.maxTemperature = this.maxTemperature == 0 ? temperature : this.maxTemperature;

		this.avgTemperature = (this.avgTemperature + temperature) / 2;
		this.minTemperature = temperature < this.minTemperature ? temperature : this.minTemperature;
		this.maxTemperature = temperature > this.maxTemperature ? temperature : this.maxTemperature;

		this.avgHumidity = this.avgHumidity == 0 ? humidity : this.avgHumidity;
		this.minHumidity = this.minHumidity == 0 ? humidity : this.minHumidity;
		this.maxHumidity = this.maxHumidity == 0 ? humidity : this.maxHumidity;

		this.avgHumidity = (this.avgHumidity + humidity) / 2;
		this.minHumidity = humidity < this.minHumidity ? humidity : this.minHumidity;
		this.maxHumidity = humidity > this.maxHumidity ? humidity : this.maxHumidity;

		this.avgPressure = this.avgPressure == 0 ? pressure : this.avgPressure;
		this.minPressure = this.minPressure == 0 ? pressure : this.minPressure;
		this.maxPressure = this.maxPressure == 0 ? pressure : this.maxPressure;

		this.avgPressure = (this.avgPressure + pressure) / 2;
		this.minPressure = pressure < this.minPressure ? pressure : this.minPressure;
		this.maxPressure = pressure > this.maxPressure ? pressure : this.maxPressure;

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
}
