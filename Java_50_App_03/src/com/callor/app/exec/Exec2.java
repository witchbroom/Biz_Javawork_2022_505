package com.callor.app.exec;

/*
 * 정수형 배열 10개를 생성하고
 * 각 요소에 1~100까지 임의정수를 생성하여 저장하고
 * 배열에 저장된 요소의 값을 모두 합산하여 출력
 */
public class Exec2 {

	public static void main(String[] args) {

		int[] intArray = new int[10];
		int intNum = 0;
		int intSum = 0;

		for (int i = 0; i < intArray.length; i++) {
			intNum = intArray[i];
			intNum = (int) (Math.random() * 100) + 1;
			intSum += intNum;
		}

		System.out.println(intSum);

	}

}
