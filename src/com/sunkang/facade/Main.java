/**
 * 
 */
package com.sunkang.facade;

import com.sunkang.adapter.Duck;
import com.sunkang.adapter.Turkey;
import com.sunkang.adapter.WildTurkey;
import com.sunkang.command.CellingFan;
import com.sunkang.command.Light;
import com.sunkang.factory.Cheese;

/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��28������12:23:29
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * ���ԭ��
 * ����֪ʶԭ�򣨣���ֻ���������̸��
 * 1.�ö�����
 * 2.�����������Ĳ��������ݽ����Ķ���
 * 3�˷�����������ʵ�������κζ���
 * 4������κ��������Ϲ�ϵ��
 * 
 * 
 * ���ģʽ���ṩ��һ��ͳһ�Ľӿڣ�����������ϵͳ�е�һȺ�ӿڡ����ģʽ������һ���߲�ӿڣ�����ϵͳ������ʹ�á�
 */
public class Main {
	public static void main(String[] args) {
		//ʵ�������
		Light light=null;
		CellingFan cellingFan=null;
		Cheese cheese=null;
		Turkey turkey=null;
		Duck duck=null;
		HomeTheaterFacade hoFacade=new HomeTheaterFacade(light, cellingFan, cheese, (WildTurkey) turkey, duck);
		hoFacade.watchMovie("sunkang coming");
		hoFacade.endMovie("sunkang go");
	}

}
