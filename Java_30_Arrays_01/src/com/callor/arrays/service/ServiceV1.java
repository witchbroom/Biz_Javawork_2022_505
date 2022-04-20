package com.callor.arrays.service;

public class ServiceV1 {
	
	public int scoreKorSum() {
		int aKor = 0;
		int bKor = 0;
		int cKor = 0;
		int dKor = 0;
		int eKor = 0;
		
		aKor = (int)(Math.random() * 100) + 1;
		bKor = (int)(Math.random() * 100) + 1;
		cKor = (int)(Math.random() * 100) + 1;
		dKor = (int)(Math.random() * 100) + 1;
		eKor = (int)(Math.random() * 100) + 1;
		
		int scoreKorSum = aKor + bKor + cKor + dKor + eKor;
				
		return scoreKorSum;
	}

}
