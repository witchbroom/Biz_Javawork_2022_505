package com.callor.app.service;

public class Service {
	
	// 학생수를 받아서 피자판수를 계산할 메서드
	public int getPizza(int num) {

		int pieces = 6;
		
		// 나눗셈시 올림을 해주는 코드
		int getPizza = (int)Math.ceil((double) num / pieces);

		return getPizza;
	}

}
