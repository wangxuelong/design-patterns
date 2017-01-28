/**
 * 
 */
package com.wxl.design.patterns.command.light;

import com.wxl.design.patterns.command.Command;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:16:29
 */
public class LightOnCommand implements Command {
	private Light light;

	/**
	 * @param light
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		light.on();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		light.off();
	}

}
