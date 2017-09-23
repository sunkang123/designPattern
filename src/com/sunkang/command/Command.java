/**
 * 
 */
package com.sunkang.command;
/**
 * 命令模式接口
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:10:33
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public interface Command {
	void excute();
	void undo();
}
