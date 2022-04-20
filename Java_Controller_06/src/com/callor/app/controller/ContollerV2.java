package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

public class ContollerV2 {
	
	public static void main(String[] args) {
		
		int sum = sum();
		System.out.println( sum );
		
		// ServiceV2 클래스의 sum()는 private이기 때문에 여기서 호출할 수 없다		
		// int sum2 = serviceV2.sum();
		
		// ServiceV2 클래스의 add method는 한정자가 생략되어 있지만
		// Controller Package의 ControllerV2 클래스에서는 호출할 수 없다
		// 왜? Package 위치가 다르기때문에
		// int add = serviceV2.add();
				
	} // end main

	public static int sum() {
		return 30 + 40;
	}
}
