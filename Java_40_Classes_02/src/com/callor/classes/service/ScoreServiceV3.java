package com.callor.classes.service;

public class ScoreServiceV3 {
	
	protected String[] students;
	protected int[] intKor;
	
	public ScoreServiceV3() {
		this(10);
	}
	
	// 정수값을 받아서 그 정수값만큼 배열을 만듬
	public ScoreServiceV3(int length) {
		students = new String[length];
		intKor = new int[length];
	}
	
	
	public ScoreServiceV3(String[] students) {
		this.students = students;
		intKor = new int[this.students.length];
	}

}
