package com.multi.www.web02;

public class Coffee2 {
	int price;
	String name;
	
	
	
	public Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public static Coffee2 c1;
	
	public static Coffee2 getInstance() {
		if(c1 == null) {
		c1 = new Coffee2(2000, "아메리카노");
		}
		return c1;
	}
	
	private Coffee2() {
		
	} //싱글톤을 위한 빌드업
//		@Override
//	public String toString() {
//		return "Coffee [price=" + price + ", name=" + name + "]";
//	}
//	
	
}
