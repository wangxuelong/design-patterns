/**
 * 
 */
package com.wxl.design.patterns.command;

/**
 * 遥控器
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:19:19
 */
public class SimpleRemoteControl {
	Command command;

	/**
	 * 
	 */
	public SimpleRemoteControl() {
	}

	/**
	 * @param command
	 *            the command to set
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 按下按钮
	 */
	public void buttonWasPressed() {
		command.execute();
	}
}
