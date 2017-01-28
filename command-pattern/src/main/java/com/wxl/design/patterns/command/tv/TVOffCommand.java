/**
 * 
 */
package com.wxl.design.patterns.command.tv;

import com.wxl.design.patterns.command.Command;

/**
 * 打开电视
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午4:14:24
 */
public class TVOffCommand implements Command {
	private TV tv;

	/**
	 * @param tv
	 */
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		tv.off();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		tv.on();
	}

}
