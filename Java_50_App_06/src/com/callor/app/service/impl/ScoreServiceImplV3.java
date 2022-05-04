package com.callor.app.service.impl;

import com.callor.app.service.ScoreService;

/*
 * V2 클래스를 상속받는 순간
 * makeScore(), printScore() method를 기본으로 사용할 수있다
 */
public class ScoreServiceImplV3 implements ScoreService{
	
	public ScoreServiceImplV3() {
		/*
		 * super() method
		 * 상속받은(V2) 클래스의 기본생성자를 호출하여
		 * protected로 선언된 변수들을 초기화하기
		 */
		super();
	}

	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

}
