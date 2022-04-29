package com.callor.app.service;

import java.util.List;

import com.callor.app.model.ScoreVO;

public class ScoreService {

	private ScoreVO[] scList;

	public ScoreService() {
		this(20);
	}

	public ScoreService(int length) {
		scList = new ScoreVO[length];
		for (int i = 0; i < scList.length; i++) {
			scList[i] = new ScoreVO();
		}

	}

	ScoreVO score = new ScoreVO();

	public void makeScore() {

		for (int i = 0; i < scList.length; i++) {
			int intKor = (int)(Math.random() * 50) + 50;
			int intEng = (int)(Math.random() * 50) + 50;
			int intMath = (int)(Math.random() * 50) + 50;
			int intSum = intKor + intEng + intMath;
			float fAvg = (float)intSum / 3.0f;
			
			scList[i].setIntKor(intKor);
			scList[i].setIntEng(intEng);
			scList[i].setIntMath(intMath);
			scList[i].setIntSum(intSum);
			scList[i].setfAvg(fAvg);
		}

	}

	public void printScore() {

		System.out.printf("학번\t 국어\t 영어\t 수학\t 총점\t 평균\n");
		for (int i = 0; i < scList.length ; i++) {
			System.out.printf("%d\t %d\t %d\t %d\t %d\t %f\t", i+1, scList[i].getIntKor(),
					scList[i].getIntEng(), scList[i].getIntMath(), scList[i].getIntSum(),
					scList[i].getfAvg());
			System.out.println();
		}

	}

}
