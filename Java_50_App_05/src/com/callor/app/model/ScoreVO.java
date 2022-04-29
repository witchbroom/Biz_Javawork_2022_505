package com.callor.app.model;

public class ScoreVO {
	
	private int intScNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	@Override
	public String toString() {
		return "ScoreVO [intScNum=" + intScNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + intSum + ", fAvg=" + fAvg + "]";
	}
	private float fAvg;
	public int getIntScNum() {
		return intScNum;
	}
	public void setIntScNum(int intScNum) {
		this.intScNum = intScNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getfAvg() {
		return fAvg;
	}
	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

}
