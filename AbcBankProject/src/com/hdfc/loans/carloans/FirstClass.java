package com.hdfc.loans.carloans;

public class FirstClass implements Wolkswagon{

	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		int x= fc.milage();
		System.out.println(x);
		String y = fc.color();
		System.out.println(y);
	  float z = fc.rank();
	  System.out.println(z);
		
		
	}

	@Override
	public int milage() {
		int x=25;
		return x;
	}

	@Override
	public String color() {
		String y="red";
		return y;
	}

	@Override
	public float rank() {
	float z=3.6f;
		return z;
	}
}
