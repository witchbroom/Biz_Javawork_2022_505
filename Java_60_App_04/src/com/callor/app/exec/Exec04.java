package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec04 {

	public static void main(String[] args) {

		List<BookVO> bookList = new ArrayList<>();
		
		// 1개의 bookVO 를 만들고
		BookVO bookVO = new BookVO();
		for (int i = 0; i < 10; i++) {
			String title = ((int) (Math.random() * 1000) + 100) + "";
			bookVO.setTitle(title);
			// 같은 bookVO 를 list에 10번 추가하기
			// 모든 list의 주소가 동일한 상태
			// 가장 마지막에 저장한 값으로 모두 통일돼버림
			bookList.add(bookVO);
		}
		for (BookVO vo : bookList) {
			System.out.println(vo.toString());
		}
		
		bookList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			BookVO bookVO1 = new BookVO();

			String title = ((int) (Math.random() * 1000) + 100) + "";
			bookVO.setTitle(title);
			// 같은 bookVO 를 list에 10번 추가하기
			// 모든 list의 주소가 동일한 상태
			// 가장 마지막에 저장한 값으로 모두 통일돼버림
			bookList.add(bookVO);
		}
	}

}
