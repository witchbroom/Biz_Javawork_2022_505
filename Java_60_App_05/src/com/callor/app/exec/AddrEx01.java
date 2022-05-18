package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrEx01 {
	
	
	public static void main(String[] args) {
		
		List<AddressVO> list = new ArrayList<>();
		
		/*
		 * AddressVO 클래스를 사용하여 3개의 객체 인스턴스 생성
		 * 동일한 클래스를 사용하여 생성하였지만
		 * 각각의 객체(hong, lee, sung)는 완전히 독립된 상태이다
		 * 특별하게 일부러 코드를 작성하지않는 한
		 * 각각의 객체는 서로에게 영향을 미치지 않는다
		 * 
		 * 데이터를 저장할 때 VO 클래스를 선언하고 객체를 만드는 이유
		 * 주소록 관리 애플리케이션을 만든다고 하면
		 * 각각 주소데이터에는 이름, 주소, 전화번호, 나이, 취미 등이 필요할 것이다
		 * 이 데이터들을 개별적인 변수로 선언을 하여 사용할 수 있다
		 * 또는 각각의 배열로 선언하여 사용할 수도 있다
		 * 
		 * 개별적인 변수로 선언을 하거나, 배열로 선언을 하게 되면
		 * 이름 - 주소 - 전화번호 - 나이 - 취미 등의 데이터 연결이 매우 불편하게 될 수 있다
		 * 경우에 따라서는 서로 완전히 다른 데이터가 저장되거나 출력될 수 있다
		 * 
		 * 객체지향에서는 이러한 개별적인 변수들을 하나의 클래스(VO)로 묶고
		 * 클래스를 사용하여 객체를 생성하면
		 * 객체와 함께 묶음으로 데이터를 관리할 수 있기 때문에
		 * 데이터가 서로 다른 값이 저장되는 것을 방지할 수 있다
		 * 
		 * 어떤 연산을 하기 위해서 method에 매개변수로 전달하거나
		 * 연산결과를 return 할때도 객체단위로 이동이 가능하다
		 * 
		 */
		AddressVO hong = new AddressVO("홍길동", "010-000-0000", "광주시", 20, "독서");
		AddressVO lee = new AddressVO("이몽룡", "010-000-0200", "남원시", 21, "축구");		
		AddressVO sung = new AddressVO("성춘향", "010-000-0221", "전주시", 22, "노래");
		
		System.out.println(hong);
		System.out.println(lee);
		System.out.println(sung);

		
		
		
		
		
		
	}

	
	
	
	

}
