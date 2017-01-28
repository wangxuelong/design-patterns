/**
 * 
 */
package com.wxl.design.patterns.command.hottub;

import com.wxl.design.patterns.command.Command;

/**
 * 打开热水器
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午4:15:41
 */
public class HottubOnCommand implements Command {
	private Hottub hottub;

	/**
	 * @param hottub
	 */
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		hottub.on();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		hottub.off();
	}

}
