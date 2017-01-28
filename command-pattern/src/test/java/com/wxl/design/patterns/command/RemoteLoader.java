/**
 * 
 */
package com.wxl.design.patterns.command;

import com.wxl.design.patterns.command.ceilingfan.CeilingFan;
import com.wxl.design.patterns.command.ceilingfan.CeilingFanHightCommand;
import com.wxl.design.patterns.command.ceilingfan.CeilingFanOffCommand;
import com.wxl.design.patterns.command.garagedoor.GarageDoor;
import com.wxl.design.patterns.command.garagedoor.GarageDoorDownCommand;
import com.wxl.design.patterns.command.garagedoor.GarageDoorUpCommand;
import com.wxl.design.patterns.command.light.Light;
import com.wxl.design.patterns.command.light.LightOffCommand;
import com.wxl.design.patterns.command.light.LightOnCommand;
import com.wxl.design.patterns.command.stereo.Stereo;
import com.wxl.design.patterns.command.stereo.StereoOffCommand;
import com.wxl.design.patterns.command.stereo.StereoOnWithCDCommand;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:10:59
 */
public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand liveingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanHightCommand ceilingFanOn = new CeilingFanHightCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, liveingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);

		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);

		remoteControl.onButtonPushed(1);
		remoteControl.offButtonPushed(1);

		remoteControl.onButtonPushed(2);
		remoteControl.offButtonPushed(2);

		remoteControl.onButtonPushed(3);
		remoteControl.offButtonPushed(4);

	}
}
