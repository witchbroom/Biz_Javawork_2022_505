package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			nums.add(num);
		}
		
		int index = 0;
		for(int num : nums) {
			if(num >= 55) {
				System.out.println(num + " 을 " + index + " 번째에서 출력");
				break;
			}
			index++;
		}
		
		
	}

}
