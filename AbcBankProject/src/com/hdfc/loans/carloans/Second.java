package com.hdfc.loans.carloans;

public class Second implements Wolkswagon {

	public static void main(String[] args) {
		Second sc = new Second();
		int result = sc.milage();
		System.out.println(result);
		
		String s1=sc.color();
		System.out.println(s1);
		float c = sc.rank();
		System.out.println(c);

	}

	@Override
	public int milage() {
		int a=20;
		return a;
	}

	@Override
	public String color() {
		String b = "black";
		return b;
	}

	@Override
	public float rank() {
		float c=3.5f;
		return c;
	}

}
