/**
 * 
 */
package com.wxl.design.patterns.command;

import com.wxl.design.patterns.command.ceilingfan.CeilingFan;
import com.wxl.design.patterns.command.ceilingfan.CeilingFanHightCommand;
import com.wxl.design.patterns.command.ceilingfan.CeilingFanLowCommand;
import com.wxl.design.patterns.command.ceilingfan.CeilingFanMediumCommand;
import com.wxl.design.patterns.command.ceilingfan.CeilingFanOffCommand;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:53:36
 */
public class RemoteLoader3 {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanHightCommand ceilingFanHight = new CeilingFanHightCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHight, ceilingFanOff);

		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();

		remoteControl.onButtonPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();

	}
}
