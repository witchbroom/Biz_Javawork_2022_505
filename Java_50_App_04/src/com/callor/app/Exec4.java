package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			nums.add(num);
		}
		
		
		int size = nums.size();
		int lastTh = 0;
		int lastNum = 0;
		for(int i = 0; i < size; i++) {
			if(nums.get(i) >= 55) {
				lastTh = i;
				lastNum = nums.get(i);
			}

		}
		
		System.out.println(lastTh + " 번째 " + lastNum);
		
		// for() index를 역순으로 진행하기 
		for(int i = size - 1 ; i > -1 ; i--) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d 번째 %3d", i, nums.get(i));
				break;
			}
		}
	}

}
