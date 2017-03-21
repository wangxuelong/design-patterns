/**
 * 
 */
package com.wxl.design.patterns.proxy.v4;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午10:31:15
 */
public class ImageComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7193948224305016681L;
	Icon icon;

	/**
	 * @param icon
	 */
	public ImageComponent(Icon icon) {
		this.icon = icon;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800 - w) / 2;
		int y = (600 - h) / 2;
		icon.paintIcon(this, g, x, y);
	}

	/**
	 * @return the icon
	 */
	public Icon getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

}
