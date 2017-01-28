/**
 * 
 */
package com.wxl.design.patterns.command.ceilingfan;

/**
 * 打开吊扇
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:13:47
 */
public class CeilingFanHightCommand extends AbstractCeilingFanCommand {

	/**
	 * @param ceilingFan
	 */
	public CeilingFanHightCommand(CeilingFan ceilingFan) {
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
		ceilingFan.high();
	}
}
