/**
 * 
 */
package com.wxl.design.patterns.command.stereo;

/**
 * 音响
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:04:47
 */
public class Stereo {
	private String location;
	private int volume = 0;

	/**
	 * @param location
	 */
	public Stereo(String location) {
		this.location = location;
	}

	/**
	 * 开
	 */
	public void on() {
		System.out.println(location + " stereo is on.");
	}

	/**
	 * 关
	 */
	public void off() {
		System.out.println(location + " stereo is off.");
	}

	/**
	 * 播放CD
	 */
	public void setCd() {
		System.out.println(location + " stereo is set for CD input.");
	}

	/**
	 * 播放DVD
	 */
	public void setDvd() {
		System.out.println(location + " stereo is set for DVD input.");
	}

	/**
	 * 收音机
	 */
	public void setRadio() {
		System.out.println(location + " stereo is set for radio input.");
	}

	/**
	 * 音量
	 */
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.print(location + " stereo volume set to " + this.volume);
	}
}
