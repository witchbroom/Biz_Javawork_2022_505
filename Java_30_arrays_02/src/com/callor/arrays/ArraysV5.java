package com.callor.arrays;

import java.util.Arrays;

public class ArraysV5 {
	
	public static void main(String[] args) {
		
		int[] intScore = new int[100];
		int i = 0;
		
		for(i = 0 ; i < intScore.length ; i++) {
			intScore[i] = (int)(Math.random() * 100) + 1;
		}
		
		/*
		 * intScore 배열에 담긴 값을 for() 문을 사용하여
		 * 각 요소별로 한줄로 출력하다가
		 * 5번째 요소를 출력한 후 Enter( new line, println() )을 하라
		 * i(index)값을 5로 나눈 나머지가 0이 될 때 println()을 실행하여 new line을 부여한다
		 * 그런데 i값은 0부터 시작한다 0 % 5의 결과는 0이 되어
		 * 처음 요소를 출력한 후 new line이 되어버린다
		 * 그래서 i+1을 먼저 실행하여 index % 5의 연산을 1부터 시작하도록 해준다
		 */
		for (i = 0 ; i < intScore.length ; i++) {
		       System.out.print(intScore[i] + ",\t");
		       if( (i+1) % 5 == 0) {
		    	   System.out.println();
		       }
		}
		
		
		
	} // end main

}
