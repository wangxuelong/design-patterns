/**
 * 
 */
package com.wxl.design.patterns.command;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:47:15
 */
public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;

	/**
	 * 
	 */
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		for (int i = 0; i < 7; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}

	public void setCommand(int solt, Command onCommand, Command offCommand) {
		onCommands[solt] = onCommand;
		offCommands[solt] = offCommand;
	}

	public void onButtonPushed(int solt) {
		onCommands[solt].execute();
		undoCommand = onCommands[solt];
	}

	public void offButtonPushed(int solt) {
		offCommands[solt].execute();
		undoCommand = offCommands[solt];
	}

	public void undoButtonPushed() {
		undoCommand.undo();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n---------------Remote Control-------------\n");
		for (int i = 0; i < onCommands.length; i++) {
			buffer.append("[solt " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
		}
		buffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return buffer.toString();
	}
}
