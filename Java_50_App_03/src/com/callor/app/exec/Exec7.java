package com.callor.app.exec;

public class Exec7 {

	public static void main(String[] args) {

		int[] intArray = new int[100];
		int num = 0;
		int pNum = 0;
		int count = 0;

		for (int i = 0; i < intArray.length; i++) {
			num = intArray[i];
			num = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intArray.length; i++) {

			for (int j = 1; j <= num; j++) {

				// 약수가 2개(1, 자기자신)인 숫자가 소수이기 때문에 약수의 갯수를 count 하도록 함
				// 0으로 나누어떨어질 때(약수일 때) count가 증가하도록 함
				if(num % j == 0){
					count++;
				}

				// count가 2인 경우(약수가 2개인 경우) 소수로 카운팅하도록 함
				if(count == 2){
					System.out.println(num + " 는 소수");
					pNum++;
				}

			}

		}

		System.out.println("소수의 갯수는 : " + pNum);

	}

}
