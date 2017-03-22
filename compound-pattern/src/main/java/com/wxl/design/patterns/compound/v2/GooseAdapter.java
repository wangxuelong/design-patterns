/**
 * 
 */
package com.wxl.design.patterns.compound.v2;

import com.wxl.design.patterns.compound.v1.Quackable;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月22日 下午9:36:34
 */
public class GooseAdapter implements Quackable {
	private Goose goose;

	/**
	 * @param goose
	 */
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.Quackable#quack()
	 */
	@Override
	public void quack() {
		goose.honk();
	}

}
