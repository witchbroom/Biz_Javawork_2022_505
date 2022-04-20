package com.callor.arrays.service;

public class ServiceV1A {
	
	/*
	 * private로 선언된 makeScore()는
	 * ServiceV1A 클래스 블럭 ( {} ) 에서만 접근(호출)할 수 있다
	 * local method(지역 method)라고 한다
	 */
	private int makeScore() {
		return (int)(Math.random() * 100) + 1;		
	}
	
	/*
	 * public으로 선언된 scoreKorSum()은 이 프로젝트의 어디에서나
	 * 클래스의 인스턴스를 생성하고 인스턴스를 통하여 접근(호출)할 수 있다
	 */
	public int scoreKorSum() {
		/*
		 * V1에서 Math.random()을 사용하여 점수를 생성하는 코드를 makeScore()로 이전하고
		 * 점수 생성이 필요한 경우 makeScore()를 호출하여 결과를 사용한다
		 */
		int aKor = makeScore();
		int bKor = makeScore();
		int cKor = makeScore();
		int dKor = makeScore();
		int eKor = makeScore();
		
		aKor = (int)(Math.random() * 100) + 1;
		bKor = (int)(Math.random() * 100) + 1;
		cKor = (int)(Math.random() * 100) + 1;
		dKor = (int)(Math.random() * 100) + 1;
		eKor = (int)(Math.random() * 100) + 1;
		
		int scoreKorSum = aKor + bKor + cKor + dKor + eKor;
				
		return scoreKorSum;
	}

}
