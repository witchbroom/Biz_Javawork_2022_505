package com.callor.controller.op;

public class Operator_03 {
	
	public static void main(String[] args) {
		
	
	int intNum1 = (int)(Math.random() + 100) + 1;
	
	/*
	 * SCE 코드
	 * 만약 random으로 생성된 값이 60 이상이면
	 * "합격 하였음" 
	 */
	if(intNum1 >= 60 || (intNum1 = 60) > 50 ) {
		System.out.println("합격 하였음");
	}
	
	
	
	
	
	
	
	
	
	/*
	 * 실수값(double, float)을 정수형 변수에 대입하면
	 * 문법 오류가 발생한다
	 * 이것은 오차에 대한 안전장치이다
	 * 경우에 따라 소수점 이하 값을 무시하고 
	 */
	
	intNum1 = (int)3.0;
	intNum1 += 3.0;
	
	/*
	 * 복합연산이 포함된 식에서는
	 * 실수값을 정수값에 대입하는데 문법오류가 나지않는다
	 * 내부적으로 강제 형변환이 일어나기 때문이다
	 * 값을 예측할 수 없고 논리적인 문제를 일으키지 않으면
	 * "많은 값을 대입"하여 오류를 방지해야 한다
	 */
	intNum1 = 0;
	intNum1 += 3.123123123;
	System.out.println(intNum1);
}

	
	} // end main

