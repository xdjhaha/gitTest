package org.zhuangshi;


//装饰类     需要是被装饰者的子类 而且有被装饰者的引用
//装饰子类在装饰时 都会调用父类的cost 方法并在装饰子类添加自己的操作
public class Dress implements Coffee{
	Coffee coffee;
	public Dress(Coffee c) {
		// TODO Auto-generated constructor stub
		this.coffee = c;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost();
	}
}
