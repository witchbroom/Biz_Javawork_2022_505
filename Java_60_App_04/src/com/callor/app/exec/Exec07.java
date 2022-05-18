package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {
	
	public static void main(String[] args) {
		
		System.out.println(Line.dLine(30));
		System.out.println("7 단 구구단");
		System.out.println(Line.sLine(30));
		for(int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d x %d = %d\n", 7, i, 7*i);
		}
		System.out.println(Line.dLine(30));
		
		
	}

}
