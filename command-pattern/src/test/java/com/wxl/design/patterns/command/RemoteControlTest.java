/**
 * 
 */
package com.wxl.design.patterns.command;

import com.wxl.design.patterns.command.garagedoor.GarageDoor;
import com.wxl.design.patterns.command.garagedoor.GarageDoorUpCommand;
import com.wxl.design.patterns.command.light.Light;
import com.wxl.design.patterns.command.light.LightOnCommand;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:21:13
 */
public class RemoteControlTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("");
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		remote.setCommand(lightOnCommand);
		remote.buttonWasPressed();

		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorUpCommand garageDoorOpenCommand = new GarageDoorUpCommand(garageDoor);
		remote.setCommand(garageDoorOpenCommand);
		remote.buttonWasPressed();

	}
}
