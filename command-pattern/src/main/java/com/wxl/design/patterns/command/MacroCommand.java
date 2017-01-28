/**
 * 
 */
package com.wxl.design.patterns.command;

/**
 * 宏命令
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午4:10:30
 */
public class MacroCommand implements Command {
	private Command[] commands;

	/**
	 * @param commands
	 */
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}

}
