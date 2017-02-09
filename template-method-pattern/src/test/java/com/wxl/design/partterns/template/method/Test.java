/**
 * 
 */
package com.wxl.design.partterns.template.method;

import com.wxl.design.partterns.template.method.hook.TeaWithHook;

/**
 * 
 * @author Wang XueLong
 * @Date 2017年2月9日 下午10:39:17
 */
public class Test {
	public static void main(String[] args) {
		TeaWithHook myTea = new TeaWithHook();
		myTea.prepareRecipe();
	}
}
