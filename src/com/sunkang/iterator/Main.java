/**
 * 
 */
package com.sunkang.iterator;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��7��4������12:11:09
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ������ģʽ����Ԫ��֮������ߵ����ν����˵������������Ǿۺ϶����þۺϵĶ����ʵ�ֱ�ø��Ӽ��
 * 
 * ������ģʽ���ṩһ�ַ���˳�����һ���ۺ϶���ĸ���Ԫ�أ�������¶���ڲ��ı�ʾ��
*
*
 */
public class Main {
	public static void main(String[] args) {
		PancakeHouseMenu houseMenu=new PancakeHouseMenu(); 
		DinerMenu dinerMenu=new DinerMenu();
		Waitress waitress=new Waitress(dinerMenu, houseMenu);
		waitress.printMenu();
	}
	

}
