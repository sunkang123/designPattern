/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������10:15:13
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CellingFan {
	public static final int HIGH=3;
	public static final int MEDIUM=2;
	public static final int LOW=1;
	public static final int OFF=0;
	
	String location;
	int speed;
	
	public CellingFan(String location){
		this.location=location;
		speed=OFF;
	}
	
	public void medium(){
		System.out.println("�ҿ����е�");
		speed=MEDIUM;
	}
	public void high(){
		System.out.println("�ҿ����ߵ�");
		speed=HIGH;
	}
	public void low(){
		System.out.println("�ҿ����͵�");
		speed=LOW;
	}
	public void off(){
		System.out.println("�ҹص�");
		speed=OFF;
	}
	public int getSpeed(){
		return speed;
	}
	

}
