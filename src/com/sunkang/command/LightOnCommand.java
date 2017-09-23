/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������10:11:14
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class LightOnCommand implements Command{
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void excute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
	

}
