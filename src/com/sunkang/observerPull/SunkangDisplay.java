/**
 * 
 */
package com.sunkang.observerPull;

import java.util.Observable;
import java.util.Observer;

import com.sunkang.observerPush.DispalyElements;

/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��20������7:27:08
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class SunkangDisplay  implements Observer,DispalyElements{
	/**
	 * ֻҪʪ�Ⱥ�ѹ��
	 */
	private float humidity;
	private float pressure;
	

	public SunkangDisplay(WeatherData weatherData) {
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("sunkang�����ʪ��Ϊ��"+humidity+"ѹ��Ϊ:"+pressure);
		System.out.println("������");
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
