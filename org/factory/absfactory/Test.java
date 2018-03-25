package org.factory.absfactory;


//抽象工厂模式
public class Test {
	public static void main(String[] args) {
		AbsFactory s = new FactoryA();
		Food f = s.food();
		Drink d = s.drink();
		f.foodname();
		d.price();
	}
}
