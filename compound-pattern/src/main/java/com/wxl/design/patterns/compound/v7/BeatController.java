/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

/**
 *
 * @author Wang XueLong
 * @Date 2017年4月13日 下午9:28:59
 */
public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;

	/**
	 * @param model
	 */
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.ControllerInterface#start()
	 */
	@Override
	public void start() {
		model.on();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.ControllerInterface#stop()
	 */
	@Override
	public void stop() {
		model.off();
		view.enableStartMenuItem();
		view.disableStopMenuItem();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.ControllerInterface#setBPM(int)
	 */
	@Override
	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v7.ControllerInterface#increaseBPM()
	 */
	@Override
	public void increaseBPM() {
		model.setBPM(model.getBPM() + 1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v7.ControllerInterface#decreaseBPM()
	 */
	@Override
	public void decreaseBPM() {
		model.setBPM(model.getBPM() - 1);
	}

}
