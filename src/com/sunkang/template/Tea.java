/**
 * 
 */
package com.sunkang.template;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��28������8:44:55
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Tea extends CaffeineBeverageWithHook{

	@Override
	void brew() {
	System.out.println("���ݲ�Ҷ");	
	}

	@Override
	void addCondiments() {
		System.out.println("��������");
	}

}
