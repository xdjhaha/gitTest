package org.jintaidaili.cglib;

/**
1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入pring-core-3.2.5.jar即可.
2.引入功能包后,就可以在内存中动态构建子类
3.代理的类不能为final,否则报错
4.目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
*/
public class Test {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		
		UserDao proxy = (UserDao)new ProxyFactory(dao).getproxyintance();
		
		proxy.save();
	}
}
