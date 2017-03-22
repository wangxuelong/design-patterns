/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

import javax.swing.JProgressBar;

/**
 *
 * @author Wang XueLong
 * @Date 2017年4月5日 下午10:28:18
 */
public class BeatBar extends JProgressBar {
	private static final long serialVersionUID = 1L;

	public void setValue(int rate) {
		super.setValue(rate);
	}
}
