/**
 * 
 */
package com.wxl.design.patterns.command;

/**
 * 命令
 * 
 * @author Wang XueLong
 * @Date 2017年1月28日 下午2:15:49
 */
public interface Command {
	/**
	 * 执行
	 */
	public void execute();

	/**
	 * 撤销
	 */
	public void undo();
}
