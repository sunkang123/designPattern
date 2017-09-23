/**
 * 
 */
package com.sunkang.strategy;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:26:36
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ���ԭ��
 * 1.�ҳ�Ӧ���п�����Ҫ�仯֮���������Ƕ�����������Ҫ����Щ����Ҫ�仯�Ĵ������һ��
 * ����װ�仯��
 * 2.��Խӿڱ�̣����������ʵ�ֱ��(�ؼ������ö�̬����Գ����ͱ��)
 * 3.������ϣ����ü̳У�����ϵͳ�е��� ����������ʱ��̬�ı���Ϊ��
 * 
 * ����ģʽ���������㷨�壬�ֱ��װ������������֮����Ի����滻����ģʽ���㷨�ı仯������ʹ��
 * �㷨�Ŀͻ�
 * 
 */
public class Main {
	public static void main(String[] args) {
		Duck modelduck=new ModelDuck();  //������Duck���ǽӿڱ��
		modelduck.dispaly();
		modelduck.perfromFly();
		modelduck.perfromQuack();
		//��̬�ı�ģ���Էɵ���Ϊ
		modelduck.setFlyBehavior(new FlyWithWings());
		modelduck.perfromFly();
		
		Duck redHeadDuck=new RedHeadDuck();
		redHeadDuck.dispaly();
		redHeadDuck.perfromFly();
		redHeadDuck.perfromQuack();
		
	}

}
