package com.callor.var;

public class Var_07 {
	
	public static void main(String[] args) {
		
		int intNum = (int)(Math.random() * 1000) + 10;
		int intANS = 33;
		
		/*
		 * Logic Algebra(비교연산), boolean 연산
		 * intNum에 담긴 값이 제시된 값보다 크거나, 작은 것을 판단하는 연산
		 */
		System.out.println("\t" + intNum);
		System.out.println("\t" + (intNum > intANS));
		System.out.println("\t" + (intNum <= 99));
		// == : ~인지 아닌지 검사해라
		// intNum % 2 == 0 : intNum을 2로 나눈 나머지가 0인지 검사해라
		System.out.println("\t" + ((intNum % 2) == 0));
		
		// 산술연산 = 결과값
		// 비교연산 = True/False
	}

}
