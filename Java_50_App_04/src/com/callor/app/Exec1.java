package com.callor.app;

public class Exec1 {

	public static void main(String[] args) {

		int[] num = new int[100];

		for (int i = 0; i < 100; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0 ; i < 100 ; i++) {
			if(num[i] >= 55) {
				System.out.print( num[i] + ", ");
			}

		}
		
		

	}

}
