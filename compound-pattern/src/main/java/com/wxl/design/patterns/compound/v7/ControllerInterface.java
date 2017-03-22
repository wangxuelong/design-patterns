/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

/**
 * 控制器
 * 
 * @author Wang XueLong
 * @Date 2017年4月5日 下午10:26:34
 */
public interface ControllerInterface {
	public void start();

	public void stop();

	public void setBPM(int bpm);

	/**
	 * 
	 */
	public void increaseBPM();

	/**
	 * 
	 */
	public void decreaseBPM();
}
