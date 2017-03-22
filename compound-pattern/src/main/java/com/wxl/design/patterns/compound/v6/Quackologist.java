/**
 * 
 */
package com.wxl.design.patterns.compound.v6;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月27日 下午9:24:19
 */
public class Quackologist implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.compound.v6.Observer#update(com.wxl.design.
	 * patterns.compound.v6.QuackObservable)
	 */
	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

}
