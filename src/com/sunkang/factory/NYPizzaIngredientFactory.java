/**
 * 
 */
package com.sunkang.factory;
/**
 * ����ŦԼԭ�ϵĹ���
 * �������������
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������12:02:47
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public  class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDouch() {
		//����dough������
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sunkang.factory.PizzaIngredientFactory#createCheeses()
	 */
	@Override
	public Cheese[] createCheeses() {
		// TODO Auto-generated method stub
		return null;
	}

}
