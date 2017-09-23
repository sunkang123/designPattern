/**
 * 
 */
package com.sunkang.command;
/**
 * 宏模式
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:59:26
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class MacroCommand implements Command{
	Command[] commands;
	public MacroCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void excute() {
		for(int i=0;i<commands.length;i++){
			commands[i].excute();
		}
	}

	@Override
	public void undo() {
		for(int i=0;i<commands.length;i++){
			commands[i].undo();
		}
	}
	

}
