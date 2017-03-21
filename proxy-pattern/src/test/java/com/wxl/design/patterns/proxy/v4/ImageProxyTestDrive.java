/**
 * 
 */
package com.wxl.design.patterns.proxy.v4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午9:00:56
 */
public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main(String[] args) {
		try {
			new ImageProxyTestDrive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ImageProxyTestDrive() throws Exception {
		cds.put("1", "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
		cds.put("2", "http://sucai.qqjay.com/qqjayxiaowo/201210/26/1.jpg");
		cds.put("3", "http://img13.poco.cn/mypoco/myphoto/20120828/15/55689209201208281549023849547194135_001.jpg");
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		for (Entry<String, String> e : cds.entrySet()) {
			final String name = e.getKey();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					imageComponent.setIcon(new ImagePorxy(getCDURL(name)));
					frame.repaint();
				}
			});
		}
		URL initalURL = new URL(cds.get("1"));
		Icon icon = new ImagePorxy(initalURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
		// image
	}

	URL getCDURL(String name) {
		try {
			return new URL(cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
