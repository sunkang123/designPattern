/**
 * 
 */
package com.sunkang.observerPush;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������8:02:14
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ���ģʽ
 * 1.Ϊ�˽�������֮����������ƶ�Ŭ��
 * 
 * 
 * �۲���ģʽ�������˶���֮���һ�Զ������������һ������һ������ı�״̬ʱ���������������߶���
 * �յ�֪ͨ���Զ�����
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
