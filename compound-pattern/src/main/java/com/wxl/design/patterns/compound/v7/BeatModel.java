/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 *
 * @author Wang XueLong
 * @Date 2017年4月5日 下午10:12:28
 */
public class BeatModel implements BeatModelInterface, MetaEventListener {
	Sequencer sequencer;
	private List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	private List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	private int bpm = 90;
	Sequence sequence;
	Track track;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.BeatModelInterface#initialize()
	 */
	@Override
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	/**
	 * 
	 */
	private void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.start();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private void buildTrackAndStart() {
		int[] trackList = { 35, 0, 46, 0 };
		sequence.deleteTrack(track);
		track = sequence.createTrack();

		makeTracks(trackList);
		track.add(makeEvent(192, 9, 1, 0, 4));
		try {
			sequencer.setSequence(sequence);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param i
	 * @param j
	 * @param k
	 * @param l
	 * @param m
	 * @return
	 */
	private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		return event;
	}

	/**
	 * @param trackList
	 */
	private void makeTracks(int[] trackList) {
		for (int i = 0; i < trackList.length; i++) {
			int key = trackList[i];
			if (i != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i + 1));
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.BeatModelInterface#on()
	 */
	@Override
	public void on() {
		setBPM(90);
		sequencer.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.BeatModelInterface#off()
	 */
	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.BeatModelInterface#setBPM(int)
	 */
	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(bpm);
		notifyBPMObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v7.BeatModelInterface#getBPM()
	 */
	@Override
	public int getBPM() {
		return this.bpm;
	}

	void beatEvent() {
		notifyBeatObservers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v7.BeatModelInterface#registerObserver(
	 * com.wxl.design.patterns.compound.v7.BeatObserver)
	 */
	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v7.BeatModelInterface#removeObserver(com
	 * .wxl.design.patterns.compound.v7.BeatObserver)
	 */
	@Override
	public void removeObserver(BeatObserver o) {
		int index = beatObservers.indexOf(o);
		if (index >= 0) {
			beatObservers.remove(index);
		}
	}

	private void notifyBeatObservers() {
		Iterator<BeatObserver> iterator = beatObservers.iterator();
		while (iterator.hasNext()) {
			iterator.next().updateBeat();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v7.BeatModelInterface#registerObserver(
	 * com.wxl.design.patterns.compound.v7.BPMObserver)
	 */
	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.compound.v7.BeatModelInterface#removeObserver(com
	 * .wxl.design.patterns.compound.v7.BPMObserver)
	 */
	@Override
	public void removeObserver(BPMObserver o) {
		bpmObservers.remove(o);
	}

	private void notifyBPMObservers() {
		Iterator<BPMObserver> iterator = bpmObservers.iterator();
		while (iterator.hasNext()) {
			iterator.next().updateBPM();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.sound.midi.MetaEventListener#meta(javax.sound.midi.MetaMessage)
	 */
	@Override
	public void meta(MetaMessage meta) {
		if (meta.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

}
