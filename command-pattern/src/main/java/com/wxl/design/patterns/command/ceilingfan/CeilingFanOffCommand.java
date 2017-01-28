/**
 * 
 */
package com.wxl.design.patterns.command.ceilingfan;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:14:27
 */
public class CeilingFanOffCommand extends AbstractCeilingFanCommand {

	/**
	 * @param ceilingFan
	 */
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super(ceilingFan);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

}
