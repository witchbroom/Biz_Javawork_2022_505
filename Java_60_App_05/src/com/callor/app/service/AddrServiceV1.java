package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {
	
	public void printAddr(AddressVO vo) {
		
		System.out.println(vo.toString());
		
	}
	
	public void printAddrList(AddressVO[] addrs) {
		
		for(int i = 0 ; i < addrs.length ; i++) {
			System.out.println(addrs[i]);
		}
		
	}
	
	public void printAddrList(List<AddressVO> adList) {
		
		for(int i = 0 ; i < adList.size() ; i++) {
			System.out.println( adList.get(i) );
		}
		
	}
	
	public int compare(Object o1, Object o2) {
		int age1 = ((AddressVO)o1).getAge();
		int age2 = ((AddressVO)o2).getAge();
		
		if(age1 > age2) {
			return 1;
		} else if(age1 < age2) {
			return -1;
		} else {
			return 0;
		}
	}


}
