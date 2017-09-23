/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��28������8:31:16
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public  abstract class CaffeineBeverageWithHook {
	
	void prepareRecipe(){
		boilWater(); //��ˮ
		brew();  //����
		pourInCup();//���뱭��
		if(customerWantsCondiments()){
			addCondiments();  //���������
		}
	}	
	abstract void brew();
	
	abstract void addCondiments();
	
	 boolean customerWantsCondiments() {
		return true;
	}

	
	 void pourInCup() {
		System.out.println("���뱭��");
	}
	 void boilWater() {
		System.out.println("��ˮ");
	}

}
