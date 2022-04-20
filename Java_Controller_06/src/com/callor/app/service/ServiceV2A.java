package com.callor.app.service;

public class ServiceV2A {
	
	public void print() {
		
		// ServiceV2와 ServiceV2A는
		// 같은 package( c.c.a.service )에
		// 저장된 클래스이기 때문에 import문이 필요없다
		ServiceV2 serviceV2  = new ServiceV2();
		
		// sum()는 private 으로 설정되어 있기 때문에 호출할 수 없다.
		// serviceV2.sum();
		
		// add()는 한정자를 생략했기 때문에
		// 같은 package에 있는 클래스들끼리는 호출이 가능하다
		serviceV2.add();
		
	}

}
