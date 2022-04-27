package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV22 {
	
	public static void main(String[] args) {
		
		List<Integer> scoreList = new ArrayList<Integer>();
		ServiceV2 sV2 = new ServiceV2(scoreList);
		System.out.println(scoreList);
		
		sV2.getScore(10);
		System.out.println(scoreList);
		
	}

}
