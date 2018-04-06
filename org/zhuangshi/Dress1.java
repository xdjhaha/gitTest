package org.zhuangshi;

public class Dress1 extends Dress {
	public Dress1(Coffee c) {
		// TODO Auto-generated constructor stub
		super(c);		//调用父类的构造函数
	}
	
	@Override
	public double cost() {
		return super.cost() + 3;
	}
	
}
