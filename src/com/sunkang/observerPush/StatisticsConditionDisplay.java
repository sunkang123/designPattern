/**
 * 
 */
package com.sunkang.observerPush;
/**
 * ͳ�Ƴ���չʾ��
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������11:37:45
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class StatisticsConditionDisplay implements Observer,DispalyElements{
	private  float temp;
	private float humidity;
	private float  pressure;
	
	
	public StatisticsConditionDisplay(Subject weatherData) {
		weatherData.registerObserver(this);//ע���ȥ
	}
	@Override
	public void display() {
		System.out.println("��ǰ�����������¶�temp��"+temp+"ʪ��Ϊ��"+humidity+"ѹ��Ϊ��"+pressure);
	}
	//�����¶ȣ�ʪ��
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
	
	
	
}
