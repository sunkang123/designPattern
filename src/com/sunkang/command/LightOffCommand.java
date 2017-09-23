/**
 * 
 */
package com.sunkang.command;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��26������10:14:17
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class LightOffCommand implements Command{
	Light light;

	public LightOffCommand(Light light) {
		this.light=light;
	}
	@Override
	public void excute() {
		light.off();
	}
	@Override
	public void undo() {
		light.on();
	}
}
