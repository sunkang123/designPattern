/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��28������8:39:15
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("���˿���");
	}

	@Override
	void addCondiments() {
        System.out.println("���Ǻ�ţ��");		
	}
	

	@Override
	boolean customerWantsCondiments() {
		boolean answer =getUserINput();
		if(answer){
			System.out.println("�����˹��ӷ���");
		}else{
			System.out.println("û�е��ù��ӷ���");
		}
		return answer;
	}

	private boolean getUserINput(){
		return false;
	}
}
