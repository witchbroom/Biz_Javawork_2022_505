package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {
	
	public static void main(String[] args) {
		
		ServiceV1 sV1 = new ServiceV1();
		
		sV1.scoreSum();
		
		System.out.println( "총점은 " + sV1.scoreSum() + " 점 입니다." );
		
		
	}

}
