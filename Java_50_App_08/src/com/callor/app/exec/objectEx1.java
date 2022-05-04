package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class objectEx1 {
	
	public static void main(String[] args) {
		
		// 한사람의 성적을 저장할 VO객체 생성
		ScoreVO scVO = new ScoreVO();
		scVO.setStNum(1);
		scVO.setIntKor(90);
		scVO.setIntEng(80);
		scVO.setIntMath(85);
		
		// 5명 학생의 성적을 저장할 VO배열 선언
		ScoreVO[] scVOs = new ScoreVO[5];
		
		// scVOs 배열의 0번 요소를 객체로 생성하기(초기화하기)
		scVOs[0] = new ScoreVO();
		scVOs[0].setStNum(2);
		scVOs[0].setIntKor(88);
		
		
		// 다수의 학생 성적을 저장할 ScoreVO list를 생성
		List<ScoreVO> scList = new ArrayList<>();
		
		
	}

}
