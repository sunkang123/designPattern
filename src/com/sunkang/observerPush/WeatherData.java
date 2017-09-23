/**
 * 
 */
package com.sunkang.observerPush;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站，观测气温，湿度，和压力
 *@author sunkang
 *@date 创建时间：2017年6月13日上午11:27:01
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class WeatherData implements Subject{
	private List<Observer> observers=new ArrayList<>();
	private float temp;//温度
	private float humidity;//湿度
	private float pressure;//压力
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
