/**
 * 
 */
package com.sunkang.singleton;
/**
 * 双重检查加锁模式   （线程 安全）
 *@author sunkang
 *@date 创建时间：2017年6月26日下午1:16:32
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Singleton3 {
private volatile static Singleton3 instance;
	
	private Singleton3(){};
	
	public  static Singleton3 getInstance(){
		if(instance==null){//检查实例
			synchronized (Singleton3.class) {
				if(instance==null){  //只要第一次才执行这里的代码
					instance=new Singleton3();
				}
			}
		}
		return instance;
	}

}
