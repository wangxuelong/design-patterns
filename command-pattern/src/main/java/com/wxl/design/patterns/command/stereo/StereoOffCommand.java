/**
 * 
 */
package com.wxl.design.patterns.command.stereo;

import com.wxl.design.patterns.command.Command;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午3:23:58
 */
public class StereoOffCommand implements Command {
	Stereo stereo;

	/**
	 * @param stereo
	 */
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#execute()
	 */
	@Override
	public void execute() {
		stereo.off();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.command.Command#undo()
	 */
	@Override
	public void undo() {
		stereo.on();
	}

}
