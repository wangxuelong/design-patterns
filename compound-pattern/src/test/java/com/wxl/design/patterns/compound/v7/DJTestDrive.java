/**
 * 
 */
package com.wxl.design.patterns.compound.v7;

/**
 *
 * @author Wang XueLong
 * @Date 2017年4月13日 下午9:33:43
 */
public class DJTestDrive {
	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
