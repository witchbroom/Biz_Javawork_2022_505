package com.callor.controller;

/*
 * com.callor.service.serviceV1 클래스의
 * method 등을 여기서 사용하겠다 선언
 */
import com.callor.service.ServiceV1;

public class Method_03 {
	
	public static void main(String[] args) {
		
		// ServiceV1 클래스에 선언된 add()를 호출하여
		// return된 값을 intSum 변수에 저장
		int intSum = ServiceV1.add();
		int intMulti = ServiceV1.multi();
		
		System.out.println(intSum + intMulti);
	}

}
