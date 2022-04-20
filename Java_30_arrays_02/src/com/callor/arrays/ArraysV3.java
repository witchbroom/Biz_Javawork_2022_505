package com.callor.arrays;

public class ArraysV3 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[5];
		int index = 0;
		
		// index 변수의 값이 0이므로 intNums[0]과 같은 코드가 된다
		// index라는 변수를 사용하여 첨자를 지정함으로써 반복되는 코드가 만들어지고
		// 단순한 코드가 생성되었다
		intNums[index ++] = (int)(Math.random() * 100) + 1;
		intNums[index ++] = (int)(Math.random() * 100) + 1;
		intNums[index ++] = (int)(Math.random() * 100) + 1;
		intNums[index ++] = (int)(Math.random() * 100) + 1;
		intNums[index ++] = (int)(Math.random() * 100) + 1;
		
		for(index = 0 ; index < 5 ; index ++) {
			intNums[index] = (int)(Math.random() * 100) + 1;
		}
		
		// 100개의 점수를 저장할 배열을 생성
		int[] intScore = new int[100];
		// 100개의 배열에 각각 1~100까지 점수를 생성하여 저장하기
		// 100개의 테스트에 사용할 점수 데이터를 만들었다
		for(index = 0 ; index < 100 ; index++) {
			intScore[index] = (int)(Math.random() * 100) + 1;
		}
		
		/*
		 * 위 코드에서 만약 데이터의 개수를 200으로 변경(new int[200]) 했을 때
		 * for() 명령문의 index < 100을 index < 200으로 변경해주어야 한다
		 * 만약 for() 명령문의 코드를 변경하지 않으면
		 * 테스트 데이터의 개수를 늘린 효과가 없어진다
		 * 
		 * 배열의 개수를 변경할때마다 코드를 추가로 변경하는 불편을 없애기 위해
		 * 자바에서는 배열의 크기와 관련된 내부 속성을 마련해 두었다
		 * 배열.length 속성은 배열의 개수를 담고있는 특별한 변수이다
		 * 배열.length 는 배열을 생성하면 배열의 개수를 보관하도록 자동으로 만들어지는 특별한 변수이다
		 * 
		 * 배열.toString() : 배열의 메서드, 배열.length : 배열의 속성
		 */
		for(index = 0 ; index < intScore.length ; index ++) {
			intScore[index] = (int)(Math.random() * 100) + 1;
		}
		
		int intSum = intScore[0];
		intSum += intScore[1];
		intSum += intScore[2];
		System.out.println(intSum);
		
		
		for(index = 0 ; index < intScore.length ; index++) {
			intSum+= intScore[index];
		}
		
		System.out.println("총합 : " + intSum);
		
		// 평균을 계산하여 Console에 출력
		// 평균결과를 소수점까지 표현하고 싶으면
		// 원 데이터를 먼저 실수형으로 강제 형변환 한 후에 연산을 하고 결과를 실수형 변수에 저장하면 된다
		float fAverage = 0;
		fAverage = (float)intSum / (float)intScore.length;
		System.out.println("평균 : " + fAverage);
	}
	

}
