package org.jintaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxUserDongTai implements InvocationHandler {
	private Object targer;
	public ProxUserDongTai(Object object) {
		// TODO Auto-generated constructor stub
		this.targer = object;
	}
	
	public Object GetProFactory(){
		return Proxy.newProxyInstance(
			targer.getClass().getClassLoader(), 
			targer.getClass().getInterfaces(), 
			new InvocationHandler() {
				@Override
				public Object invoke(Object targer1, Method method, Object[] args)throws Throwable {
					System.out.println("开始事务2");
			        //执行目标对象方法
			        Object returnValue = method.invoke(targer, args);
			        System.out.println("提交事务2");
					return returnValue;
				}
			}
		);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("开始事务22");
        //执行目标对象方法
        Object returnValue = method.invoke(targer, args);
        System.out.println("提交事务22");
		return returnValue;
	}
}
