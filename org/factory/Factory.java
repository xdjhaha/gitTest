package org.factory;

public class Factory {
	public static SuperTest TestFactory(int i) {
		if(i ==1){
			Tes1 s = new  Tes1();
			return s;
		}
		if(i == 2){
			Tes2 s = new Tes2();
			return s;
		}
		return null;
	}
	
	
}
