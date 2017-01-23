/**
 * 
 */
package com.wxl.design.patterns.decorate.beverate.condiment;

import com.wxl.design.patterns.decorate.beverate.Beverate;

/**
 * 调料
 * 
 * @author Wang XueLong
 * @Date 2017年1月23日 下午9:31:17
 */
public abstract class CondimentDecorator extends Beverate {
	public abstract String getDescription();
}
