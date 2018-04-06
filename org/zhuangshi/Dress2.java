package org.zhuangshi;

public class Dress2 extends Dress {

	public Dress2(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return super.cost() + 4;
	}
}
