package com.callor.controller;

public class Boolean_03 {
	
	public static void main(String[] args) {
		
		boolean bYes = true;
		boolean bWhat = bYes;
		
		// bYes에 저장된 값이 false가 물어보는 연산이 실행되고
		//그 결과가 bWhat에 저장된다
		bWhat = bYes == false;
		
		// bYes에 저장된 값이 true가 아니냐? 라고 물어보는 연산
		// 결과는 당연히 false
		bWhat = bYes != true;
		
		// ! : Not 연산기호
		bWhat = !bYes;
		bWhat = !bWhat;
		bWhat = !bWhat;
	}

}
