/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * 试图
 * 
 * @author Wang XueLong
 * @Date 2017年4月5日 下午10:25:05
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver {
	/**
	 * 模型
	 */
	BeatModelInterface model;
	/**
	 * 控制器
	 */
	ControllerInterface controller;
	JFrame viewFrame;
	JPanel viewPanel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;
	JFrame controlFrame;
	JPanel controlPanel;

	JLabel bpmLable;
	JTextField bpmTextField;
	JButton setBPMButton;
	JButton increaseBPMButton;
	JButton decreaseBPMButton;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem startMenuItem;
	JMenuItem stopMenuItem;

	/**
	 * @param controller
	 * @param model
	 */
	public DJView(ControllerInterface controller, BeatModelInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver) this);
		model.registerObserver((BPMObserver) this);
	}

	public void createView() {
		viewPanel = new JPanel(new GridLayout(1, 2));
		viewFrame = new JFrame("View");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(new Dimension(100, 80));
		bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		beatBar = new BeatBar();
		beatBar.setValue(0);
		JPanel bpmPlanel = new JPanel(new GridLayout(2, 1));
		bpmPlanel.add(beatBar);
		bpmPlanel.add(bpmOutputLabel);
		viewPanel.add(bpmPlanel);
		viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewFrame.pack();
		viewFrame.setVisible(true);
	}

	/**
	 * 
	 */
	public void createControls() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		controlFrame = new JFrame("Control");
		controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controlFrame.setSize(new Dimension(100, 80));

		controlPanel = new JPanel(new GridLayout(1, 2));
		menuBar = new JMenuBar();
		menu = new JMenu("DJ Control");
		startMenuItem = new JMenuItem("Start");
		menu.add(startMenuItem);
		startMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.start();
			}
		});

		stopMenuItem = new JMenuItem("Stop");
		menu.add(stopMenuItem);
		stopMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.stop();
			}
		});

		JMenuItem exit = new JMenuItem("Exit");
		menu.add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menuBar.add(menu);
		controlFrame.setJMenuBar(menuBar);

		bpmTextField = new JTextField(2);
		bpmLable = new JLabel("Enter BPM:", SwingConstants.RIGHT);
		setBPMButton = new JButton("Set");
		setBPMButton.setSize(new Dimension(10, 40));
		increaseBPMButton = new JButton(">>");
		decreaseBPMButton = new JButton("<<");
		setBPMButton.addActionListener(this);
		increaseBPMButton.addActionListener(this);
		decreaseBPMButton.addActionListener(this);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
		buttonPanel.add(increaseBPMButton);
		buttonPanel.add(decreaseBPMButton);

		JPanel enterPanel = new JPanel(new GridLayout(1, 2));
		enterPanel.add(bpmLable);
		enterPanel.add(bpmOutputLabel);

		JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
		insideControlPanel.add(enterPanel);
		insideControlPanel.add(setBPMButton);
		insideControlPanel.add(buttonPanel);
		controlPanel.add(insideControlPanel);

		bpmLable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		controlFrame.getRootPane().setDefaultButton(setBPMButton);
		controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

		controlFrame.pack();
		controlFrame.setVisible(true);
	}

	@Override
	public void updateBPM() {
		int bpm = model.getBPM();
		if (bpm == 0) {
			bpmOutputLabel.setText("offline");
		} else {
			bpmOutputLabel.setText("Current BPM: " + model.getBPM());
		}
	}

	@Override
	public void updateBeat() {
		beatBar.setValue(model.getBPM());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == setBPMButton) {
			int bpm = Integer.parseInt(bpmTextField.getText());
			controller.setBPM(bpm);
		} else if (e.getSource() == increaseBPMButton) {
			controller.increaseBPM();
		} else if (e.getSource() == decreaseBPMButton) {
			controller.decreaseBPM();
		}
	}

	public void enableStopMenuItem() {
		stopMenuItem.setEnabled(true);
	}

	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}

	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}

	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}
}
