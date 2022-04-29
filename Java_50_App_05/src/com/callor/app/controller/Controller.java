package com.callor.app.controller;

import com.callor.app.service.Service;
import com.callor.app.utils.Annotation;

public class Controller {
	
	public static void main(String[] args) {
		
		Service sV = new Service();
		int num = (int)(Math.random() * 25) + 25;
		
		
		System.out.println(Annotation.dLine(50));
		System.out.println("학생 수 " + num + " 명에 " + "피자는 총 " + sV.getPizza( num ) + " 판이 필요함." );
		System.out.println(Annotation.dLine(50));
	}

}
