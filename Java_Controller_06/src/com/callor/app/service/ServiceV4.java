package com.callor.app.service;

public class ServiceV4 {
	
	/*
	 * 클래스 영역(scope)에서 변수 선언하기
	 * class scope에 선언된 변수는
	 * 현재 class의 모든 method에서 공통으로 공유할 수 있다.
	 */
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	
	public int scoreSum() {
		
		/*
		 * class scope에 선언된 변수에
		 * 1~100까지의 정수를 생성하여 저장해 두기
		 * 여기에서 저장된 변수값은 다른 method에서 값을 변경(저장)하기 전에는 계속 유지하고 있다
		 * 현재 프로젝트가 종료될때까지
		 * 여기에서 저장된 변수값은 scorePrint()에서 읽어서 출력하면 같은 값이 출력된다
		 */
		intKor = (int)(Math.random() * 100) + 1;
		intEng = (int)(Math.random() * 100) + 1;
		intMath = (int)(Math.random() * 100) + 1;
		int intSum = intKor + intEng + intMath;
				
		return 0;
	}
	public void scorePrint() {
		
		
		
	}

}
