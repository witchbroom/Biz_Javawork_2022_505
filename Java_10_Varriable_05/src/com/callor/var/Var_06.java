package com.callor.var;

public class Var_06 {
	
	public static void main(String[] args) {
		
		// 연산의 우선순위에 의해 int가 먼저, 0~0.999 사이의 정수값만 남아서 0이 출력됨
		int intNum = (int)Math.random() * 100;
		int intAge = (int)(Math.random() * 100) + 10;
		
		String strName = "홍길동";
		
		System.out.printf("\t%s 의 나이는 %d 이다 \n", strName, intAge);
		
		
		// 정수는 %d, 실수는 %f, 문자열은 %s, 캐릭터는 %c
 		
	}

}
