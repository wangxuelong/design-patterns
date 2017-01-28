/**
 * 
 */
package com.wxl.design.patterns.command.ceilingfan;

import com.wxl.design.patterns.command.Command;

/**
 * 打开吊扇
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:13:47
 */
public abstract class AbstractCeilingFanCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	/**
	 * @param ceilingFan
	 */
	public AbstractCeilingFanCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public abstract void execute();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
