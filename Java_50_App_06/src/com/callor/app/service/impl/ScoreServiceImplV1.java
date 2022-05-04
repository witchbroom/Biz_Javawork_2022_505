package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.utils.Line;

public class ScoreServiceImplV1 implements ScoreService{
	
	/*
	 * Service 클래스에서 필요한 데이터를 클래스 영역에 선언할때는
	 * final 키워드를 부착하자
	 * final 키워드를 부착하여 혹시 모를 데이터손상을 방지하고
	 * 초기화하지 않으면 오류가 나서 NullpointerException 도 막을 수 있다
	 */
	
	
	// 리스트 객체를 final로 선언하고
	private final List<ScoreVO> scList;
	public ScoreServiceImplV1() {
		// 생성자에서 리스트 객체를 초기화하여
		// NullpointerException 사전에 예방한다
		scList = new ArrayList<>();
	}
	
	public void makeScore() {
		int size = scList.size();
		for(int i = 0 ; i < 20 ; i++) {
			int intKor = (int)(Math.random() * 50) + 51;
			int intEng = (int)(Math.random() * 50) + 51;
			int intMath = (int)(Math.random() * 50) + 51;
			
			// 생성된 3과목의 점수를 VO클래스를 생성하여 저장하기
			// 인스턴스 변수를 만들어서 값을 저장하기
			ScoreVO scVO = new ScoreVO();
			scVO.setIntStNum(i + 1);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			int intSum = intKor = intEng + intMath;
			float fAvg = (float)intSum / 3;
			
			scVO.setIntSum(intSum);
			scVO.setfAvg(fAvg);
			
		}
	}
	
	
	
	public void printScore() {
		int size = scList.size();
		int linelength = 50;
		
		System.out.println(Line.dLine(linelength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(linelength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(linelength));
		int[] intTotal = new int[4];
		int I_KOR = 0;
		int I_ENG = 1;
		int I_MATH = 2;
		int I_SUM = 3;
		for(int i = 0 ; i < size ; i++) {
			ScoreVO scVO = scList.get(i);
			System.out.printf("%3d\t", scVO.getIntStNum());
			System.out.printf("%3d\t", scVO.getIntKor());
			System.out.printf("%3d\t", scVO.getIntEng());
			System.out.printf("%3d\t", scVO.getIntMath());
			System.out.printf("%3d\t", scVO.getIntSum());
			System.out.printf("%3.2f\t", scVO.getfAvg());
			
			intTotal[I_KOR] += scVO.getIntKor();
			intTotal[I_ENG] += scVO.getIntEng();
			intTotal[I_MATH] += scVO.getIntMath();
			intTotal[I_SUM] += scVO.getIntSum();
		}
		System.out.println(Line.sLine(linelength));
		System.out.printf("%d\t%d\t%d\t%d\t%5.2f\n", intTotal[I_KOR]);
	}

}
