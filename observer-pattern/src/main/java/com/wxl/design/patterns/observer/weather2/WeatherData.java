/**
 * 
 */
package com.wxl.design.patterns.observer.weather2;

import java.util.Observable;

/**
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午9:22:45
 */
public class WeatherData extends Observable {
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

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		this.measurementsChanged();
	}

	public void measurementsChanged() {
		super.setChanged();
		super.notifyObservers();
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

}
