/**
 * 
 */
package com.sunkang.strategy;
/**
 * ģ��Ѽ�����,ֻ��֨֨��
 *@author sunkang
 *@date ����ʱ�䣺2017��6��13������10:15:14
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class ModelDuck extends Duck{

	/* (non-Javadoc)
	 * @see com.sunkang.strategy.Duck#dispaly()
	 */
	@Override
	public void dispaly() {
		System.out.println("����ģ��Ѽ");
	}

	public ModelDuck() {
		flyBehavior=new FlyNoWay();
		quackBehavior=new Squack();
	}
	
	
	

}
