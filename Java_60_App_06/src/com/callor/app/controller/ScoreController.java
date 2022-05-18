package com.callor.app.controller;

import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreController {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 scService = new ScoreServiceImplV1();
		
		scService.makeScore();
		scService.printScore();
		
	}

}
