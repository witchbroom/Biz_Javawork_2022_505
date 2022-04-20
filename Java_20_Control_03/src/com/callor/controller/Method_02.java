package com.callor.controller;

public class Method_02 {
	
	public static void main(String[] args) {
		
		int addResult = add();
		int mulResult = multi();
		
		System.out.println(addResult + mulResult);
		
	}

	
	public static int add() {
		int addNum1 = (int)(Math.random() * 100) + 1;
		int addNum2 = (int)(Math.random() * 100) + 1;
		return addNum1 + addNum2;
	}
	public static int multi() {
		int mulNum1 = (int)(Math.random() * 100) + 1;
		int mulNum2 = (int)(Math.random() * 100) + 1;
		return mulNum1 * mulNum2;
	}
}
