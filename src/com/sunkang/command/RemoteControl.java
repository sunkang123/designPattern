/**
 * 
 */
package com.sunkang.command;
/**
 * 遥控器
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:35:17
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class RemoteControl {
	private int size=7;
	private Command[] onCommands;
	private Command[] offCommands;
	  Command undoCommend;
	public RemoteControl() {
		onCommands=new Command[size];
		offCommands=new Command[size];
		Command noCommand=new Nocommand();
		for(int i=0;i<size;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
		undoCommend=noCommand;
	}
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
	}
	public void offButtonPushed(int slot){
		offCommands[slot].excute();
		undoCommend=offCommands[slot];
	}
	
	public void onButtonPushed(int slot){
		onCommands[slot].excute();
		undoCommend=onCommands[slot];
	}

	public void undoButtonPushed(){
		undoCommend.undo();
	}
	
	
	public Command[] getOnCommands() {
		return onCommands;
	}
	
	public Command[] getOffCommands() {
		return offCommands;
	}
	
	
	
	
}
