/**
 * 
 */
package com.sunkang.observerPush;

import java.util.ArrayList;
import java.util.List;

/**
 * ����վ���۲����£�ʪ�ȣ���ѹ��
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������11:27:01
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class WeatherData implements Subject{
	private List<Observer> observers=new ArrayList<>();
	private float temp;//�¶�
	private float humidity;//ʪ��
	private float pressure;//ѹ��
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(0);
	}

	@Override
	public void notifyObserver() {
		for(Observer o:observers){
			o.update(temp,humidity,pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity,float pressure){
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

}
