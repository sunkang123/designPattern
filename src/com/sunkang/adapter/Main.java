/**
 * 
 */
package com.sunkang.adapter;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��27������11:41:35
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ���ģʽ����ͨ���������������нӿ�ת�����ò����ݵĽӿڱ�ɼ��ݣ�������ÿͻ���ʵ�ֵĽӿڽ���
 * �����ı�ӿڣ����������Խ��ı�Ĳ��ַ�װ����
 * 
 * ʵ���˰ѿͻ���ӿڽ��а������������Ǻ�ʵ�ְ�����
 * 
 * ��������ʹ�ö��ؼ̳У�java������
 * 
 * ����������ʹ����ϵ�ģʽ����ĳ����
 * 
 * ������ģʽ����һ����Ľӿڣ�ת���ɿͻ���������һ���ӿڣ�
 * ��������ԭ���Ľӿڲ����ݵ�����Ժ����޼�
 */
public class Main {
	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		Turkey  turkey=new WildTurkey();
		System.out.println("the turkey say...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("the duck say.....");
		testDuck(duck);
		
		System.out.println(" the turkeyAdater say.....");
		Duck turkeyAdater=new TurkeyAdapter(turkey);//ͨ���������ѻ������Ѽ��
		testDuck(turkeyAdater);
		
	}
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
