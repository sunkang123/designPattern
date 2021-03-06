/**
 * 
 */
package com.sunkang.iterator;
/**
 *@author sunkang
 *@date 创建时间：2017年7月3日下午11:21:41
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class MenuItem {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	
	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
