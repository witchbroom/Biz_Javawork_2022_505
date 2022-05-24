package com.callor.app.exec;

public class Exec02 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int count = 0;
		int evenSum = 0;

		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			if (num[i] % 2 == 0) {
				count++;
				evenSum += num[i];
			}
		}

		System.out.println("짝수의 개수: " + count);
		System.out.println("짝수의 합: " + evenSum);

	}

}
