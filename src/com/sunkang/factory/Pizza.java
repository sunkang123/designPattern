/**
 * 
 */
package com.sunkang.factory;

import java.util.ArrayList;

/**
 *@author sunkang
 *@date 创建时间：2017年6月25日下午10:39:55
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	ArrayList<String> toppings=new ArrayList<>();
	
	 void prepare(){
		 System.out.println("preparing "+name);
		 System.out.println("Tossing dough "+dough);
		 for(int i=0;i<toppings.size();i++){
			 System.out.println("  "+toppings.get(i));
		 }
		
	 };
	 void bake(){
		 System.out.println("bake for 25 minutes at 350");
	 };
	 void cut(){
		 System.out.println("cutting ");
	 };
	 void box(){
		 System.out.println("place pizza ");
	 };
	 
	 public String getName(){
		 return name;
	 }
	 
}
