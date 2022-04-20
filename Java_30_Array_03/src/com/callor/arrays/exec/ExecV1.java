package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {

		int aNum = 0;

		aNum = (int) (Math.random() * 100) + 1;

		if (aNum % 2 == 0) {
			System.out.println(aNum + " 은(는) 짝수입니다.");
		} else {
			System.out.println(aNum + " 은(는) 홀수입니다.");
		}

		
		
		String strName = "";
		int intNum = 0;
		intNum = (int)(Math.random() * 100) + 1;
		
		boolean bEven = false;
		
		// intNum 변수를 2로 나눈 나머지가 0인가?
		// intNum 변수에 담긴 값을 2로 나눈 나머지가 0인가?
		// 0이면 true, 아니면 false가 bEven에 저장된다
		bEven = (intNum % 2) == 0;
	}
	

}
