/**
 * 
 */
package com.wxl.design.patterns.command;

import com.wxl.design.patterns.command.light.Light;
import com.wxl.design.patterns.command.light.LightOffCommand;
import com.wxl.design.patterns.command.light.LightOnCommand;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:44:33
 */
public class RemoteLoader2 {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand liveingRoomLightOff = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingRoomLightOn, liveingRoomLightOff);

		System.out.println(remoteControl);

		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();

		remoteControl.offButtonPushed(0);
		remoteControl.onButtonPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();
	}
}
