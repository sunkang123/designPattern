/**
 * 
 */
package com.sunkang.adapter;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��27������11:38:58
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class TurkeyAdapter implements Duck{
   Turkey turkey;
   
	public TurkeyAdapter(Turkey turkey) {
	this.turkey = turkey;
}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0;i<5;i++){
			turkey.fly();//����Ҫ����βſ��Ը�Ѽ��һ��
		}
	}

}
