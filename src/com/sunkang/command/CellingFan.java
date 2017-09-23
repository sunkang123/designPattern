/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date 创建时间：2017年6月26日下午10:15:13
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
		System.out.println("我开到中挡");
		speed=MEDIUM;
	}
	public void high(){
		System.out.println("我开到高挡");
		speed=HIGH;
	}
	public void low(){
		System.out.println("我开到低挡");
		speed=LOW;
	}
	public void off(){
		System.out.println("我关挡");
		speed=OFF;
	}
	public int getSpeed(){
		return speed;
	}
	

}
