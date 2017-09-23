/**
 * 
 */
package com.sunkang.observerPush;
/**
 * ��ǰ����չʾ��
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������11:37:45
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CurrentConditionDisplay implements Observer,DispalyElements{
	private  float temp;
	private float humidity;
	
	
	public CurrentConditionDisplay(Subject weatherData) {
		weatherData.registerObserver(this);//ע���ȥ
	}
	@Override
	public void display() {
		System.out.println("��ǰ�����������¶�temp��"+temp+"ʪ��Ϊ��"+humidity);
	}
	//�����¶ȣ�ʪ��
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		display();
	}
	
	
}
