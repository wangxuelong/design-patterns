/**
 * 
 */
package com.wxl.design.patterns.command.ceilingfan;

/**
 * 吊扇
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:12:37
 */
public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	/**
	 * 位置
	 */
	private String localtion;
	private int speed;

	/**
	 * @param localtion
	 */
	public CeilingFan(String localtion) {
		this.localtion = localtion;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		System.out.println(localtion + " ceiling fan is on hight.");
	}

	public void medium() {
		speed = MEDIUM;
		System.out.println(localtion + " ceiling fan is on medium.");
	}

	public void low() {
		speed = LOW;
		System.out.println(localtion + " ceiling fan is on low.");
	}

	public void off() {
		speed = OFF;
		System.out.println(localtion + " ceiling fan is off.");
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

}
