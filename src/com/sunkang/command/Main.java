/**
 * 
 */
package com.sunkang.command;


/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������10:47:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ����ģʽ�������ͽ����߰��������������ֻ��¶һ��execute��������
 * ���Դ�������ĺ꣬һ����ִ�ж������
 * 
 * ����ģʽ����"����"��װ�ɶ����Ա�ʹ�ò�ͬ�����󡢶��л�����־����������������
 * ����ģʽҲ֧�ֿɳ����Ĳ�����
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
		//�򿪰�ť
		control.onButtonPushed(1);
		control.onButtonPushed(2);
		//�رհ�ť
		control.offButtonPushed(2);
		control.offButtonPushed(1);
		//����
		control.undoButtonPushed();
		//��ִ��
		System.out.println("��ִ��");
		MacroCommand macroCommand=new MacroCommand(control.getOffCommands());
		macroCommand.excute();
	}

}
