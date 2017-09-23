/**
 * 
 */
package com.sunkang.adapter;
/**
 *@author sunkang
 *@date 创建时间：2017年6月27日下午11:38:58
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
			turkey.fly();//火鸡需要飞五次才可以跟鸭子一样
		}
	}

}
