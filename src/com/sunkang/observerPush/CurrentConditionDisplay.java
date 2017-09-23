/**
 * 
 */
package com.sunkang.observerPush;
/**
 * 当前气温展示板
 *@author sunkang
 *@date 创建时间：2017年6月13日上午11:37:45
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CurrentConditionDisplay implements Observer,DispalyElements{
	private  float temp;
	private float humidity;
	
	
	public CurrentConditionDisplay(Subject weatherData) {
		weatherData.registerObserver(this);//注册进去
	}
	@Override
	public void display() {
		System.out.println("当前场景布告板的温度temp："+temp+"湿度为："+humidity);
	}
	//接受温度，湿度
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		display();
	}
	
	
}
