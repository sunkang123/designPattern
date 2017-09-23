/**
 * 
 */
package com.sunkang.observerPull;


/**
 *@author sunkang
 *@date 创建时间：2017年6月20日下午7:36:40
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 主题对象继承了java.util.Observable  和观察者实现了java.util.Observer接口
 */
public class Mian {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		SunkangDisplay sunkang=new SunkangDisplay(weatherData);
		weatherData.setMeasurements(1, 2, 3);
	}

}
