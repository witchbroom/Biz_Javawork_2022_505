package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}
		
		int index = 0;
		for(int num : nums) {
			if(num >= 55) {
				System.out.println(index + " 번째 배열의 값 : " + num);
			}
			index++;
		}
		
		int size = nums.size();
		for(int i = 0 ; i < size ; i++) {
			if(nums.get(i) >= 55) {
				System.out.println(i + " 번째 배열의 값 : " + nums.get(i));
			}
		}
			
		}

	}


