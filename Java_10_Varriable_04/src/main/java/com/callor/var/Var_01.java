package com.callor.var;

public class Var_01 {
	
	public static void main(String[] args) {
		
		// 변수를 선언하고 clear (0을 저장, 대입)
		int intNum1 = 0;
		int intNum2 = 0;
		
		// 변수에 값 저장하기
		// 변수에 어떤 값을 저장하면 이미 저장된 값은 무조건 사라진다
		intNum1 = 33;
		intNum2 = 55;
		
		// 사칙연산 결과를 저장(보관)하기위한 변수 선언 clear
		// intNum1, intNum2 변수에 담긴 값을 읽어와서
		// 사칙연산을 수행한 후 각각의 변수에 저장하기
		int intPlus = intNum1 + intNum2;
		int intMinus = intNum1 - intNum2;
		int intMul = intNum1 * intNum2;
		int intDiv = intNum1 / intNum2;
		
		// 화면에 form을 만든 후 출력하기
		System.out.printf("\t%d + %d = %d", intNum1, intNum2, intPlus);
		System.out.printf("\t%d - %d = %d", intNum1, intNum2, intMinus);
		System.out.printf("\t%d * %d = %d", intNum1, intNum2, intMul);
		System.out.printf("\t%d / %d = %d", intNum1, intNum2, intDiv);		
		
	}

}
