/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

/**
 * 节拍器模型
 * 
 * @author Wang XueLong
 * @Date 2017年4月5日 下午10:04:48
 */
public interface BeatModelInterface {
	/**
	 * 初始化
	 */
	public void initialize();

	/**
	 * 打开
	 */
	public void on();

	/**
	 * 关闭
	 */
	public void off();

	/**
	 * 设置BPM
	 * 
	 * @param bpm
	 */
	public void setBPM(int bpm);

	/**
	 * 获取BPM
	 * 
	 * @return
	 */
	public int getBPM();

	/**
	 * 注册节拍观察者
	 * 
	 * @param o
	 */
	public void registerObserver(BeatObserver o);

	/**
	 * 移除节拍观察者
	 * 
	 * @param o
	 */
	public void removeObserver(BeatObserver o);

	/**
	 * 注册BPM观察者
	 * 
	 * @param o
	 */
	public void registerObserver(BPMObserver o);

	/**
	 * 移除BPM观察者
	 * 
	 * @param o
	 */
	public void removeObserver(BPMObserver o);
}
