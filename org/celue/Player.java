package org.celue;

public class Player {
	double amount = 0;
	double sumamount = 0;
	CalPrice calPrice = new Orgnic(); //初始都是普通状态
	
	public double jisuan(double amount){
		this.sumamount += amount;
//		if(sumamount<1000 && sumamount>0){
//			 calPrice = new Orgnic();
//			 return calPrice.Calprice(amount);
//		}
//		if(sumamount>=1000 && sumamount <2000){
//			 calPrice = new Vip1();
//			 return calPrice.Calprice(amount);
//		}
//		else{
//			 calPrice = new Vip2();
//			 return calPrice.Calprice(amount);
//		}
		CalpriceFactory calpriceFactory = new CalpriceFactory(); //将指定策略的功能从客户类分离出去
		calPrice = calpriceFactory.createCal(sumamount);
		return calPrice.Calprice(amount);
	}
}
