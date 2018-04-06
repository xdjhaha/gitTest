package org.zhuangshi;

public class Test {
	public static void main(String[] args) {
	Coffee c1 = new Coffee1();
	Dress d1 = new Dress1(c1);
	Dress d2 = new Dress2(d1);
	System.out.println(d2.cost());
	}
}
