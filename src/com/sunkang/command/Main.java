/**
 * 
 */
package com.sunkang.command;


/**
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:47:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 命令模式将动作和接受者包进对象。这个对象只暴露一个execute（）方法
 * 可以创建命令的宏，一次性执行多个命令
 * 
 * 命令模式：将"请求"封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
 * 命令模式也支持可撤销的操作。
 */
public class Main {
	
	public static void main(String[] args) {
		Light light=new Light();
		LightOnCommand lightOnCommand=new LightOnCommand(light);
		LightOffCommand lightOffCommand=new LightOffCommand(light);
		
		CellingFan cellingFan=new CellingFan("sunkang  room");
		CeilingFanHighCommand ceilingFanHighCommand=new CeilingFanHighCommand(cellingFan);
		
		RemoteControl control=new RemoteControl();
		control.setCommand(1, lightOnCommand, lightOffCommand);
		control.setCommand(2, ceilingFanHighCommand, ceilingFanHighCommand);
		//打开按钮
		control.onButtonPushed(1);
		control.onButtonPushed(2);
		//关闭按钮
		control.offButtonPushed(2);
		control.offButtonPushed(1);
		//撤销
		control.undoButtonPushed();
		//宏执行
		System.out.println("宏执行");
		MacroCommand macroCommand=new MacroCommand(control.getOffCommands());
		macroCommand.excute();
	}

}
