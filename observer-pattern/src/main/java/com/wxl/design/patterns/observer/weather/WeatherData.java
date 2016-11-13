/**
 * 
 */
package com.wxl.design.patterns.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午4:41:15
 */
public class WeatherData implements Subject {
	private List<Observer> observers;

	/**
	 * 
	 */
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

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

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		this.measurementsChanged();
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void measurementsChanged() {
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.observer.weather.Subject#addObserver(com.wxl.
	 * design.patterns.observer.weather.Observer)
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.observer.weather.Subject#removeObserver(com.wxl
	 * .design.patterns.observer.weather.Observer)
	 */
	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.observer.weather.Subject#notifyObservers(float,
	 * float, float)
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

}
