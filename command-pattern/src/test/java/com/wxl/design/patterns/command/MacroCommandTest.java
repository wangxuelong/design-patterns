/**
 * 
 */
package com.wxl.design.patterns.command;

import com.wxl.design.patterns.command.hottub.Hottub;
import com.wxl.design.patterns.command.hottub.HottubOffCommand;
import com.wxl.design.patterns.command.hottub.HottubOnCommand;
import com.wxl.design.patterns.command.light.Light;
import com.wxl.design.patterns.command.light.LightOffCommand;
import com.wxl.design.patterns.command.light.LightOnCommand;
import com.wxl.design.patterns.command.stereo.Stereo;
import com.wxl.design.patterns.command.stereo.StereoOffCommand;
import com.wxl.design.patterns.command.stereo.StereoOnWithCDCommand;
import com.wxl.design.patterns.command.tv.TV;
import com.wxl.design.patterns.command.tv.TVOffCommand;
import com.wxl.design.patterns.command.tv.TVOnCommand;

/**
 * 宏命令测试
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午4:11:44
 */
public class MacroCommandTest {
	public static void main(String[] args) {
		String location = "Living Room";
		Light light = new Light(location);
		TV tv = new TV(location);
		Stereo stereo = new Stereo(location);
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = new Command[] { lightOn, stereoOnWithCD, tvOn, hottubOn };
		Command[] partyOff = new Command[] { lightOff, stereoOff, tvOff, hottubOff };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonPushed(0);
		System.out.println("--- Pushing Macro Off ---");
		remoteControl.offButtonPushed(0);
	}
}
