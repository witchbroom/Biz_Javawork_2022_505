package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {
	
	public static void main(String[] args) {
		
		/*
		 * List : interface, 데이터 그룹을 저장하기 위한 type
		 * 			Collections type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
		 * List를 선언할 때는 Generic type을 지정한다
		 * 1. List 에 add 하는 데이터를 제한하여 잘못된 데이터가 add 되는것을 방지
		 * 2. 메모리 낭비를 막고 성능상 이점이 있기 때문에
		 * 아래 선언된 List는 Generic type이 AddressVO 이다
		 * 여기 List 에 데이터를 추가하려면 먼저 AddressVO type의 vo 객체를 만들고
		 * 데이터를 저장한 다음 add 한다
		 */
		List<AddressVO> adList = new ArrayList<>();
		AddressVO hong = AddressVO.builder().name("홍길동").addr("광주").build();
		adList.add(hong);
		AddressVO sung = AddressVO.builder().name("성춘향").addr("남원").build();
		adList.add(sung);
		AddressVO lee = AddressVO.builder().name("이몽룡").addr("나주").build();
		adList.add(lee);
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(adList);
		
	}

}
