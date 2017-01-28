/**
 * 
 */
package com.wxl.design.patterns.command.light;

import com.wxl.design.patterns.command.Command;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:03:45
 */
public class LightOffCommand implements Command {
	Light light;

	/**
	 * @param light
	 */
	public LightOffCommand(Light light) {
		this.light = light;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		light.off();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		light.on();
	}

}
