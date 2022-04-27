package com.callor.app.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.callor.app.service.ServiceV2;

public class ControllerV2 {
	
	public static void main(String[] args) {
		
		// ServiceV2 에는 기본생성자가 없기 때문에
		// 기본생성자를 호출하여 비번을 변경할 수 없다
		// 그 이유는 ServiceV2에서는 내부에서 사용하는
		// intList를 초기화하는 코드가 없고
		// ServiceV2를 호출하는 외부에서(Controller에서)
		// 초기화된 List를 매개변수로 주입해서 사용해야하기 때문에
		
		// 만약 기본생성자를 호출하여 객체를 만들게 되면
		// intList에서 Nullpointer Exception이 발생할 것이다
		// 그러한 이유로 기본생성자를 아예 호출하지 못하도록 만든다
		// 기본생성자에서 intList를 초기화하는 코드를 추가할 수 있지만
		// ServiceV2 클래스의 생성자가 복잡해질 수 있다
		
		List<Integer> scoreList = new ArrayList<>();
		ServiceV2 sV2 = new ServiceV2(scoreList);
		
		// List interface 를 상속받은 구현 클래스들..
		List<Integer> list1 = new ArrayList<>();
		ServiceV2 sV3 = new ServiceV2(list1);
		
		List<Integer> list2 = new Stack<Integer>();
		ServiceV2 sV4 = new ServiceV2(list2);
		// List<Integer> list3 = new Vactor<>();
		
		List<Integer> list3 = new LinkedList<>();
		ServiceV2 sV5 = new ServiceV2(list3);
	}

}
