/**
 * 
 */
package com.wxl.design.patterns.command.garagedoor;

/**
 * 车库门
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:26:15
 */
public class GarageDoor {
	private String location;

	/**
	 * @param location
	 */
	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " garage door is up.");
	}

	public void down() {
		System.out.println(location + " garage door is down.");
	}

	public void stop() {
		System.out.println(location + " garage door is stop.");
	}

	public void lightOn() {
		System.out.println(location + " garage door light is on.");
	}

	public void lightOff() {
		System.out.println(location + " garage door light is off.");
	}
}
