package com.callor.app.exec;

public class Exec1 {
	
	public static void main(String[] args) {
		
		int ranNum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			ranNum = (int)(Math.random() * 100) + 1;
			if(ranNum % 2 == 0) {
				System.out.println(ranNum + " 는 짝수임");
			} else {
				System.out.println(ranNum + " 는 홀수임");
			}
		}
		
	}

}
