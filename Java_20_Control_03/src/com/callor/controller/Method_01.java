package com.callor.controller;

public class Method_01 {
	
	public static void main(String[] args) {
				
		int intSum = num();
		
		System.out.println( intSum );
		
	}
	
	public static int num() {
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		return intNum1 + intNum2;
	}

}
