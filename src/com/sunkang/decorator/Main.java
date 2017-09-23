/**
 * 
 */
package com.sunkang.decorator;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��25������9:44:32
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ���ü̳�����������Ϊ�����ڱ���ʱ��̬�����ģ��������е����඼��̳���ͬ����Ϊ
 * ��ϵ�������չ�������Ϊ���Ϳ���������ʱ��̬�ؽ�����չ��
 * 
 * װ���ߺͱ�װ���߶�������ͬ�ĳ� ���͡�
 * InputStream(�������)--->FilterInputStream������װ���ߣ�----->{ 1.PushbackInputStream��װ���ߣ�
 * 																2.BufferInputStream
 * 																3.DataInputStream
 * 																4.LineNumberInputStream 
 * 
 * ���ģʽ��
 * 1.��Ӧ�ö���չ���ţ����޸Ĺرա�
 * 
 * 
 * 
 * װ����ģʽ����̬�ؽ����θ��ӵ������ϣ���Ҫ��չ���ܣ�װ�����ṩ�˱ȼ̳и����е��Ե��������
 */
public class Main {
	
	public static void main(String[] args) {
		Beverage beverage=new Expresso();
		System.out.println(beverage.getDescription()+":"+beverage.cost());
		
		beverage=new Mocha(beverage);
		beverage=new Wich(beverage);
		beverage=new Mocha(beverage);
		System.out.println(beverage.getDescription()+":"+beverage.cost());
		
		Beverage beverage1=new HouseBlend();
		System.out.println(beverage1.getDescription()+":"+beverage1.cost());
		beverage1=new Mocha(beverage1);
		beverage1=new Wich(beverage1);
		beverage1=new Wich(beverage1);
		System.out.println(beverage1.getDescription()+":"+beverage1.cost());
	}

	
	
}
