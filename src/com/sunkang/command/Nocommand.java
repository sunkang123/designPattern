/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:35:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public  class Nocommand implements Command {
	@Override
	public void excute() {
		System.out.println("什么也不做");
	}

	@Override
	public void undo() {
		System.out.println("什么也不撤销");
	}

}
