package com.callor.app.exec;

public class Exec4 {
	
	public static void main(String[] args) {
		
		/*
		 * 1부터 100까지 임의의 수를 생성하고
		 * 그 수가 소수(prime number)인지 판별하시오 
		 */
		int num = (int)(Math.random() * 100) + 1;
		
		// 소수는 1과 자기 자신만으로 나누어떨어지기때문에 1과 자기자신 사이의 범위를 지정한 반복문을 생성하고 그 내부에 if 조건문을 활용하여
		// 한번이라도 0으로 나누어떨어지면 그것은 합성수이고, 그렇지 않은 경우는 소수라는 결론

		// 소수를 판별하는 조건문 선언
		boolean pNum = true;
		
		// 1은 소수도 합성수도 아니고, 2인 경우에는 반복문이 실행되지 않기 때문에 2를 기본값으로 설정한다.
		// 1과 자기자신(num) 외에 다른 수로 나누어떨어질 경우(num % 1 == 0 이 false일 경우) 합성수이다.
		// 합성수를 구했으니 break를 사용하여 반복문에서 빠져나온다.
		
		
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				pNum = false;
				break;
			}
		}
		
		if(pNum) {
			System.out.println(num + " 는 소수이다.");
		} else {
			System.out.println(num + " 는 소수가 아니다.");
		}
	}

}
