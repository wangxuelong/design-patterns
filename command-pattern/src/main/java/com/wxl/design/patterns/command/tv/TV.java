/**
 * 
 */
package com.wxl.design.patterns.command.tv;

/**
 * 电视
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午4:05:16
 */
public class TV {
	private String location;
	/**
	 * 频道
	 */
	private int channel;

	/**
	 * 音量
	 */
	private int volume;

	/**
	 * @param location
	 */
	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " TV is on.");
	}

	public void off() {
		System.out.println(location + " TV is off.");
	}

	/**
	 * @param channel
	 *            the channel to set
	 */
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.println(location + " TV channel is set to " + this.channel);
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(location + " TV volume is set to " + this.volume);
	}

}
