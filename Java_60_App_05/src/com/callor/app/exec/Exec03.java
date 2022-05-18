package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;

public class Exec03 {

	
	public static void main(String[] args) {
		
		List<AddressVO> addrs = new ArrayList<>();
		
		AddressVO aVO = new AddressVO();
		aVO.setName("홍길동");
		aVO.setAge(30);
		addrs.add(aVO);
		
		addrs.add(AddressVO.builder().name("이몽룡").age(20).build());
		addrs.add(AddressVO.builder().name("성춘향").age(16).build());
		
		// 요소데이터가 아직 공백(blank)인 객체를 list에 추가하고
		// 추가된 위치는 전체 리스트 size -1 번 위치가 된다
		addrs.add(new AddressVO());
		// 리스트의 size 값을 확인하고
		int size = addrs.size();
		// 마지막에 추가된 데이터의 위치는 size -1이다(0부터 시작하니까)
		// size -1 위치의 객체에 요소값들을 setting
		addrs.get(size -1).setName("임꺽정");
		addrs.get(size -1).setAge(40);
		
				
		for(AddressVO vo : addrs) {
			System.out.println(vo.toString());
		}
		
		for(int i = 0 ; i < addrs.size() ; i++) {
			for(int j = i + 1 ; j < addrs.size() ; j++) {
				if(addrs.get(i).getName().compareTo(addrs.get(j).getName()) > 0 ) {
					AddressVO _aVO = addrs.get(i);
					addrs.set(i, addrs.get(j));
					addrs.set(j, _aVO);
				}
			}
		}
		System.out.println("=".repeat(100));
		for(AddressVO _vo : addrs) {
			System.out.println(_vo.toString());
		}
		
		
		
		System.out.println("=".repeat(100));
		
		for(int i = 0 ; i < size ; i++) {
			for(int j = i + 1 ; j < size ; j++) {
				// list.get(위치) 형식으로 VO를 추출하고
				// 각 요소변수를 getter
				// list.get(위치).getAge()
				// 배열의 i 요소인 aVO 의 나이가 더 큰값이면
				if(addrs.get(i).getAge() > addrs.get(j).getAge()) {
					// 배열의 i번째 요소를 _tVO 에 임시저장
					// 배열의 i번째 요소를 대피
					AddressVO _tVO = addrs.get(i);
					
					// i번째 요소위치에 j번째 요소값을 복사
					addrs.set(i, addrs.get(i));
					// 대피해두었던 i번째 요소값을 j번째에 복사
					addrs.set(j, _tVO);
					
					// i보다 j가 크다 -> i를 임시변수에 옮겨둠 -> i위치에 j값을 옮김
					// -> 비어있는 j위치에 임시변수에 옮겨뒀던 i값을 옮겨서 교환 끝! 을 반복
				}
			}
		}
		
	}
	
}
