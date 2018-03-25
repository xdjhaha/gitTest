package org.jintaidaili;

//1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
//因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
public class Test {
	public static void main(String[] args) {
		//第一种实例
//		UserDaoImpl daoImpl = new UserDaoImpl();
//		ProxUser proxUser = new ProxUser(daoImpl);
//		proxUser.save();
		
		//第二种实例
		ProxUser proxUser2 = new ProxUser();
		proxUser2.save();
	}
}

