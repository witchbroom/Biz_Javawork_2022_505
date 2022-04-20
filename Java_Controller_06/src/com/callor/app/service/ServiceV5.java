package com.callor.app.service;

import java.util.Scanner;

import com.callor.app.service.utils.LinePrint;

public class ServiceV5 {
	
	int intKor = 0;
	int intEng = 0;
	int intMath = 0;
	
	public int scoreSum() {
		
		String dLine = new String("=");
		String sLine = new String("s");
		Scanner scan = new Scanner(System.in);
		
		System.out.println(dLine.repeat(100));
		System.out.println("나라 고교 성적처리 V1");
		System.out.println(sLine.repeat(100));
		System.out.println("다음 성적을 50 ~ 100점 범위에서 입력하세요");
		
		System.out.print("국어 > ");
		intKor = scan.nextInt();
		System.out.print("영어 > ");
		intEng = scan.nextInt();
		System.out.print("수학 > ");
		intMath = scan.nextInt();
		
		// 현재 클래스의 총점 계산 method를 호출하여 총점 받아오기
		int intSum = 0;
		intSum = intKor + intEng + intMath;
		System.out.println(LinePrint.sLine);
		System.out.println("총점 : \t" + intSum);
		System.out.println(LinePrint.dLine);
		
		
		return scoreSum();
	} // end scoreSum()
	
	
	
	

}
