/**
 * 
 */
package com.wxl.design.patterns.command.light;

/**
 * 电灯
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:17:04
 */
public class Light {
	private String location;

	/**
	 * @param location
	 */
	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on.");
	}

	public void off() {
		System.out.println(location + " light is off.");
	}
}
