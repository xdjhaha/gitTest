package org.jintaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestDongT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 目标对象
        IuserDao target = new UserDaoImpl();
        InvocationHandler method = new ProxUserDongTai(target);
        // 【原始的类型 class cn.itcast.b_dynamic.UserDao】
        Class<?> cls = target.getClass();
        // 给目标对象，创建代理对象
        //System.out.println(new ProxUserDongTai(target).GetProFactory());
        IuserDao proxy  = (IuserDao)new ProxUserDongTai(target).GetProFactory(); //注意GetProFactory中方法的invoke方法参数 target，应该是ProxUserDongTai对实现类的引用，而不是invoke方法穿过去的参数
        IuserDao proxy1 = (IuserDao)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), method);
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());
        proxy.save();
        proxy1.save();
        // 执行方法   【代理对象】
    }
	/**在测试代码中，Proxy.newProxyInstance()方法需要3个参数：类加载器（要进行代理的类）、被代理类实现的接口，事务处理器。
	所以先实例化UserDaoImpl，实例化InvocationHandler的子类ProxUserDongTai，将各参数传入Proxy的静态方法newProxyInstance()
	即可获得UserDaoImpl的代理类，前面的静态代理，代理类是我们编写好的，而动态代理则不需要我们去编写代理类，是在程序中动态生成的。*/
}
