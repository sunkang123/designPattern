/**
 * 
 */
package com.sunkang.observerPull;


/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��20������7:36:40
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * �������̳���java.util.Observable  �͹۲���ʵ����java.util.Observer�ӿ�
 */
public class Mian {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		SunkangDisplay sunkang=new SunkangDisplay(weatherData);
		weatherData.setMeasurements(1, 2, 3);
	}

}
