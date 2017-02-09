/**
 * 
 */
package com.wxl.design.partterns.template.method.hook;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 咖啡
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:16:28
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.partterns.template.method.CaffeineBeverage#brew()
	 */
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.partterns.template.method.CaffeineBeverage#addCondiments()
	 */
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.partterns.template.method.CaffeineBeverage#
	 * customerWantsCondiments()
	 */
	@Override
	public boolean customerWantsCondiments() {
		String answer = this.getUserInput();
		if (answer.toLowerCase().equals("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like mike and sugar with you coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.out.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "n";
		}
		return answer;
	}
}
