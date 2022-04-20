package com.callor.controller;

public class Method_02 {
	
	public static void main(String[] args) {
		
		int intNum1 = num();
		double douNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = floatNum();
		boolean bYes = bYes();
		String str = nation();
		
		System.out.println( num() );
		System.out.println( doNum() );
		System.out.println( longNum() );
		System.out.println( floatNum() );
		System.out.println( bYes() );
		System.out.println( nation() );
		
		
	} // end main
	
	/*
	 * 명령문 해석
	 * 1. num()를 실행하여 => num()를 호출하여 실행하고
	 * 2. num()가 return하는 데이터를 intNum변수에 저장하라
	 */
	
	/*
	 * intNum1 변수는 main()에서 선언하여 사용하고 있지만
	 * num()에서 intNum1 이름으로 변수를 선언해도 된다
	 * main()에서 선언 intNum1과 num()에서 선언 intNum1은
	 * 부르는 이름만 같고 완전히 다른 변수다
	 * 
	 * main()에 선언된 intNum1변수는 main()의 지역변수(local var)라고 하고
	 * num()에 선언된 intNum1 변수는 num()의 지역변수라고 한다
	 */
	public static int num() {
		int intNum1 = 55;
		
		// main()에서 intNum1 변수의 값을 사용할 수 있도록
		// intNum1 변수의 값을 return 한다
		return intNum1;
	}
	public static double doNum() {
		double douNum1 = 55.5;
		return douNum1;		
	}
	public static long longNum() {
		long longNum1 = 777;
		return longNum1;
	}
	public static float floatNum() {
		float fNum1 = 55.555f;
		return fNum1;
	}
	public static boolean bYes() {
		int bNum1 = 22;
		int bNum2 = 22;
		boolean bYes = bNum1 == bNum2;
		return bYes;
	}
	public static String nation() {
		String str = "Hello";
		return str;
	}

}
