/**
 * 
 */
package com.sunkang.singleton;
/**
 * 静态内部内模式（线程安全的，并达到懒加载的效果）
 * 不调用Singleton.getInstance()就不会创建实例。
 * 达到了lazy loading的效果，即按需创建实例。
 *@author sunkang
 *@date 创建时间：2017年6月26日下午1:21:27
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Singleton4 {
	
	private Singleton4(){};
	 private static class SingletonHolder{
	        private final static Singleton4 instance=new Singleton4();
	    }
    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }
	

}
