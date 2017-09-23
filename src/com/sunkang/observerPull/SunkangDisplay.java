/**
 * 
 */
package com.sunkang.observerPull;

import java.util.Observable;
import java.util.Observer;

import com.sunkang.observerPush.DispalyElements;

/**
 *@author sunkang
 *@date 创建时间：2017年6月20日下午7:27:08
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class SunkangDisplay  implements Observer,DispalyElements{
	/**
	 * 只要湿度和压力
	 */
	private float humidity;
	private float pressure;
	

	public SunkangDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("sunkang看板的湿度为："+humidity+"压力为:"+pressure);
		System.out.println("可以了");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData)o;
			humidity=weatherData.getHumidity();
			pressure=weatherData.getPressure();
			display();
		}
	
	}

}
