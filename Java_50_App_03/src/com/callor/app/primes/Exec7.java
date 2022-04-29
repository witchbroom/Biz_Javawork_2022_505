package com.callor.app.primes;


public class Exec7 {

	public static void main(String[] args) {

		int[] intArray = new int[100];
		int num = 0;
		int hNum = 0;
		int pNum = 0;
		int count = 0;

		for (int i = 0; i < intArray.length; i++) {
			num = intArray[i];
			num = (int) (Math.random() * 100) + 1;

			boolean pSol = true;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					pSol = false;
					break;
				}

			}

			if (pSol == true) {
				pNum++;
			}

		}

		System.out.println("소수의 개수는 : " + pNum);

	}

}


