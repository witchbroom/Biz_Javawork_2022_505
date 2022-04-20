package com.callor.var;

public class Var_01 {
	
	public static void main(String[] args) {
		
		double douNum1 = 0;
		double douNum2 = 0;
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		
		System.out.println(douNum1 + douNum2);
		System.out.println(douNum1 - douNum2);
		System.out.println(douNum1 * douNum2);
		System.out.println(douNum1 / douNum2);
	}

}
