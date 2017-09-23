/**
 * 
 */
package com.sunkang.observerPull;

import java.util.Observable;

/**
 *@author sunkang
 *@date 创建时间：2017年6月20日下午7:14:27
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	
	public WeatherData() {
		super();
	}

	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity,float pressure){
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
	

}
