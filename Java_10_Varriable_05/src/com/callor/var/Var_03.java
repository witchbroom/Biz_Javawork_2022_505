package com.callor.var;

public class Var_03 {
	
	public static void main(String[] args) {
		
		double doNum1 = 0;
		double doNum2 = 0;
		
		doNum1 =  Math.random() * 1000+1;
		doNum2 =  Math.random() * 1000+1;
		
		double doSum = doNum1 + doNum2;
		double doMinus = doNum1 - doNum2;
		double doMulti = doNum1 * doNum2;
		double doDiv = doNum1 / doNum2;
				
		
		System.out.printf("\t%f + %f = %f\n", doNum1, doNum2, doSum);
		System.out.printf("\t%f - %f = %f\n", doNum1, doNum2, doMinus);
		System.out.printf("\t%f * %f = %f\n", doNum1, doNum2, doMulti);
		System.out.printf("\t%f / %f = %f\n", doNum1, doNum2, doDiv);	
		
		
		// doNum1 : 0.0000 ~ 0.999 범위의 실수가 생성되어 저장
		/*
		 * Math.random() 이 실행된 결과가 담긴 doNum1 변수의 값에
		 * 1000을 곱하여 다시 doNum1에 저장하라
		 * doNum1 = doNum1 * 1000;과 같다
		 * doNum1 : 0.000 ~ 999.999 범위의 실수가 저장
		 */
		doNum1 *= 1000;
		
		/*
		 * doNum1에 담긴 값에 1을 더하여 다시 doNum1에 저장
		 * doNum1 : 1.000 ~ 1000.999 범위의 실수가 저장
		 */
		doNum1 ++;
		
		// 정수값으로 변환
		// intNum1 : 1 ~ 1000 범위의 정수가 저장
		int intNum1 = (int)doNum1;
		
		
	}

}
