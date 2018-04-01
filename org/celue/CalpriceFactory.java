package org.celue;

public class CalpriceFactory {
	CalPrice calPrice = null;
	public CalPrice createCal(double sumamount){
		
		if(sumamount<1000 && sumamount>0){
			return calPrice = new Orgnic();
		}
		if(sumamount>=1000 && sumamount <2000){
			return calPrice = new Vip1();
		}
		else{
			return calPrice = new Vip2();
		}
	}
}
