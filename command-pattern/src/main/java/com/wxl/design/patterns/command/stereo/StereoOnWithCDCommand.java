/**
 * 
 */
package com.wxl.design.patterns.command.stereo;

import com.wxl.design.patterns.command.Command;

/**
 * 打开音响播放CD
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:08:26
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	/**
	 * @param stereo
	 */
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		stereo.off();
	}

}
