package org.factory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory s =new Factory();
		SuperTest t = s.TestFactory(2);
		System.out.println(t.toString());
		
		
		//工厂模式
		FactorySuper ss = new Factory1();
		SuperTest tt =ss.create();
		System.out.println(tt.toString());
		
		
		
	}

}
