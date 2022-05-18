package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {
	
	public static void main(String[] args) {
		
		AddressVO adVO1 = new AddressVO("이름1", "전화번호1", "주소1", 10, "취미1");
		AddressVO adVO2 = new AddressVO("이름2", "전화번호2", "주소2", 20, "취미2");
		AddressVO adVO3 = new AddressVO("이름3", "전화번호3", "주소3", 30, "취미3");
		
		
		String[] addrVO = new String[3];
		addrVO[0] = adVO1.toString();
		addrVO[1] = adVO2.toString();
		addrVO[2] = adVO3.toString();
		
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(addrVO[i]);
		}
		
		AddressVO[] addrs = new AddressVO[3];
		addrs[0] = AddressVO.builder().name("홍길동").tel("010-111-1111").build();
		
		addrs[1] = new AddressVO();
		addrs[1].setName("이몽룡");
		addrs[1].setTel("010-222-2222");
		
		addrs[2] = new AddressVO();
		addrs[2].setName("성춘향");
		addrs[2].setTel("010-333-3333");
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrs);
	}

}
