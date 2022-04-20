package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String strNum = scan.nextLine();
		int intNum = 0;
		if(strNum.equals("")) {
			System.out.println("숫자만 입력해 주세요~~");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		System.out.print("문자열 입력 > ");
		String strValue = scan.nextLine();
		
		System.out.println("입력된 정수 : " + intNum);
		System.out.println("입력된 문자열 : " + strValue);
		
		
		
	}

}
