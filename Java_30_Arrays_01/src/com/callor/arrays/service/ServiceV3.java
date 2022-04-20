package com.callor.arrays.service;

public class ServiceV3 {
	
	int[] intKor;
	int[] intEng;
	
	/*
	 * ServiceV3 클래스의 생성자 method
	 * return type이 아무것도 없다
	 * method 이름이 클래스 이름과 같다 (첫글자 대문자)
	 * 클래스를 선언하면 자동으로 생성되나 코드는 보이지 않는다
	 * 
	 * 만약 My() 과 같은 코드를 만나면 My 클래스의 생성자 method라고 부른다
	 * 
	 * 여기서는 ServiceV3() 생성자 method를 코드로 선언할 것이다
	 * 생성자 method에 intKor 배열을 생성하는 코드를 추가한다
	 * 
	 * 생성자 method는 클래스를 사용하여 인스턴스를 생성할때
	 * 반드시 의무적으로 호출해야하는 method이다
	 * 이 method에 배열을 생성하는 코드를 추가하면 자동으로 intKor 배열이 사용할 준비가 된다.
	 * 
	 * 어떤 클래스를 사용하는데 꼭 필요한 
	 */
	public ServiceV3() {
		intKor = new int[10];
		intEng = new int[10];
		intKor[3] = 100;
		
	}
	
	public void viewKor3() {
		System.out.println(intKor[3]);
	}
	public void viewEng3() {
		System.out.println(intEng[3]);
	}

}
