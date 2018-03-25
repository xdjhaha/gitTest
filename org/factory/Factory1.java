package org.factory;

public class Factory1 extends FactorySuper{

	@Override
	public SuperTest create() {
		SuperTest s = new Tes1();
		return s;
	}

}
