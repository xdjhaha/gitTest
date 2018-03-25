package org.factory.absfactory;

public class FactoryA extends AbsFactory{

	@Override
	public Food food() {
		// TODO Auto-generated method stub
		return new NoodFood();
	}

	@Override
	public Drink drink() {
		// TODO Auto-generated method stub
		return new Writedrink();
	}

}
