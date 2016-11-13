/**
 * 
 */
package com.wxl.design.patterns.observer.weather2;

import com.wxl.design.patterns.observer.weather2.impl.CurrentConditionsDisplay;
import com.wxl.design.patterns.observer.weather2.impl.ForecastDisplay;
import com.wxl.design.patterns.observer.weather2.impl.StatisticsDisplay;
import com.wxl.design.patterns.observer.weather2.impl.ThirdPartyDisplay;

/**
 * 
 * @author Wang XueLong
 * @Date 2016年11月13日 下午9:31:58
 */
public class WeatherDataTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasurements(30.2f, 60f, 100f);

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(26.6f, 80f, 900f);

		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(38.8f, 55.5f, 80f);

		ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);
		weatherData.setMeasurements(40.2f, 95.9f, 125f);

		System.out.println();
	}
}
