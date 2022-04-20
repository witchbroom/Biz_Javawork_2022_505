package com.callor.arrays;

public class ArraysV4 {
	
	public static void main(String[] args) {
		
		int index = 0;
		for(index = 0 ; index < 10 ; index++) {
			System.out.println(index);
		}
		
		/*
		 * for() 명령문 내부에서 index 값으로 사용되는 변수는
		 * 특별한 경우가 아니면 for() 명령문이 끝나고 필요가 없는 변수이다
		 * 그래서 for() 명령문의 초기화 영역에서 변수를 선언한다
		 * 이렇게 하면 아래에서 변수 i는 for(){} 끝나면 자동으로 소멸되고
		 * 기억장치에서 clear된다
		 * 
		 * for() 명령문의 초기화영역에서 변수의 선언과 생성을 같이한다
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
	}

}
