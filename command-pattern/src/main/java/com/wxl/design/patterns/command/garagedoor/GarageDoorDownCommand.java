/**
 * 
 */
package com.wxl.design.patterns.command.garagedoor;

import com.wxl.design.patterns.command.Command;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:22:24
 */
public class GarageDoorDownCommand implements Command {

	GarageDoor door;

	/**
	 * @param door
	 */
	public GarageDoorDownCommand(GarageDoor door) {
		this.door = door;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		door.down();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		door.up();
	}

}
