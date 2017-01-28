/**
 * 
 */
package com.wxl.design.patterns.command.garagedoor;

import com.wxl.design.patterns.command.Command;

/**
 * 打开车库门
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:25:44
 */
public class GarageDoorUpCommand implements Command {
	GarageDoor door;

	/**
	 * @param door
	 */
	public GarageDoorUpCommand(GarageDoor door) {
		this.door = door;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		door.up();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		door.down();
	}

}
