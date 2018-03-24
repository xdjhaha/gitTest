package org.jintaidaili.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{
	private Object targetObject;
	public ProxyFactory(Object target){
		this.targetObject = target;
	}
	
	public Object getproxyintance(){
		//工具类
		Enhancer en = new Enhancer();
		//设置父类
		en.setSuperclass(targetObject.getClass());
		//设置回掉函数
		en.setCallback(this);
		//创建子类
		return en.create();
	}
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("开始事务");
		
		Object returnvalue = arg1.invoke(targetObject, arg2);
		System.out.println("提交事务");
		return returnvalue;
	}
	
}
