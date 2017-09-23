/**
 * 
 */
package com.sunkang.command;
/**
 * ��ģʽ
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������10:59:26
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
