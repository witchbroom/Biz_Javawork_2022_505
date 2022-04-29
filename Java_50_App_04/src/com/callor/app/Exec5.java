package com.callor.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exec5 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);
		}

		// 가장 큰 값이 나타나는 위치와 값을 함께 출력
		
		int size = nums.size();
		int bestTh = 0;
		int bestNum = 0;
		for(int i = 1 ; i < size ; i++) {
			if(nums.get(i) > i) {
				bestTh = i;
				bestNum = nums.get(i);
			}
		}
		
		System.out.println(bestTh + " 번째 " + bestNum);

	}

}
