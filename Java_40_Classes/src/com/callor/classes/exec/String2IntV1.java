package com.callor.classes.exec;

import com.callor.classes.service.utils.Line;

public class String2IntV1 {
	
	public static void main(String[] args) {
		
		String strAge = "";
		int intAge = 33;
		
		// 숫자형 변수 + "문자열" : 숫자값을 문자열형 값으로 형변환
		strAge = intAge + "";
		
		// Integer 클래스에 선언된 toString static method에게
		// 정수값 arg로 전달하여 문자열로 return 받는다
		
		// Integer.toString() 를 사용하여
		// 정수형 숫자를 문자열형 숫자로 바꾼다
		strAge = Integer.toString(intAge);
		
		System.out.println(strAge);
		
		
		strAge = "55";
		// Integer.valueOf() 를 사용하여
		// 문자열형 숫자를 정수형 숫자로 바꾼다
		intAge = Integer.valueOf(strAge);
		
		System.out.println(Integer.toBinaryString(33));
	
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
		int intSum = num1 + num2;
		int intBinNum1 = Integer.valueOf(strBinNum1);
		int intBinNum2 = Integer.valueOf(strBinNum2);
		
		
		
		String strSum = Integer.toBinaryString(intSum);
		
		System.out.println(Line.dLine(20));
		System.out.printf("   %s\n", strBinNum1);
		System.out.printf(" + %s\n", strBinNum2);
		System.out.println("-".repeat(20));
		System.out.printf("   %s\n",strSum);
		
		
	}

}
