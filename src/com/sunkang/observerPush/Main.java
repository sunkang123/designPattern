/**
 * 
 */
package com.sunkang.observerPush;
/**
 *@author sunkang
 *@date 创建时间：2017年6月13日下午8:02:14
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 设计模式
 * 1.为了交互对象之间的松耦合设计而努力
 * 
 * 
 * 观察者模式：定义了对象之间的一对多的依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会
 * 收到通知并自动更新
 */
public class Main {

		public static void main(String[] args) {
			WeatherData  sub=new WeatherData();
			new CurrentConditionDisplay(sub);
			new StatisticsConditionDisplay(sub);
			sub.setMeasurements(1,2,3);
			sub.setMeasurements(2, 3, 4);
		}

}
