/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��28������8:47:13
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 
 * ������ԭ��
 * ����ã���绰�������ǣ����ǻ���ã���绰�����㡣
 * 
 * ������ԭ����Ը���һ�ַ�ֹ"��������"�ķ��������߲���������Ͳ���������Ͳ�����������߲���������߲�
 * ����������߲���������߲�����������Ͳ����ʱ���������ܾͷ����ˣ�û��֪��ϵͳ�������Ƶ�
 * 
 * java��Arrays.sort��ducks��������duck��Ҫʵ����Comparable�ķ����ſ���ʵ������
 * ��ʵ���˶��㷨�ķ�װ������compateTo()������ʵ�֣�
 * 
 * ģ�巽��ģʽ����һ������������һ���㷨�ĹǼܣ�����һЩ�����ӳٵ������У�ģ�巽��ʹ���������
 * �ڲ��ı��㷨�Ľṹ������£����¶����㷨�е�Ĭд����
 */
public class Main {
	public static void main(String[] args) {
		Tea tea=new Tea();
		CoffeeWithHook coffee=new CoffeeWithHook();
		System.out.println("making a tea");
		tea.prepareRecipe();
		
		System.out.println("making a coffee");
		coffee.prepareRecipe();
		
	}
	

}
