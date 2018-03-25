package org.factory;

public class Factory2 extends FactorySuper{

	@Override
	public SuperTest create() {
		SuperTest s = new Tes2();
		return s;
	}

}
