package com.callor.app.exec;

public class Exec2 {
	
	public static void main(String[] args) {
		
		int pay = (int)(Math.random() * 1000000) + 200000;
		
		/*
		int oMan = pay / 50000;
		int man = (pay % 50000) / 10000;
		int oCheon = ((pay % 50000) % 10000) / 5000;
		int cheon = (((pay % 50000) % 10000) % 5000) / 1000;
		int oBaek = ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int baek = (((((pay % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int oSip = ((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int sip = (((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;

		
		System.out.println("총 급여 : " + pay);
		System.out.println("==================");
		System.out.println("오만원 : " + oMan);
		System.out.println("만원 : " + man);
		System.out.println("오천원 : " + oCheon);
		System.out.println("천원 : " + cheon);
		System.out.println("오백원 : " + oBaek);
		System.out.println("백원 : " + baek);
		System.out.println("오십원 : " + oSip);
		System.out.println("십원 : " + sip);
		*/
		
		/*
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		System.out.println("==================");
		System.out.println(pay);
		System.out.println("==================");
		for(int i = 0; i < money.length+1 ; i++) {
			// 급여를 화폐단위로 나눠서 나눠떨어졌을 때
			if(pay % money[i] == 0) {
				System.out.println(i);
			} else {
				int j = pay / money[i];
				int k = j / money[i+1];
				System.out.println(money[i]+"원 : " + j);
			}
			
			}
		*/
		
		int paper = (pay / 50000);
		pay -= paper * 50000;
		paper = (pay / 10000);
		System.out.println(paper);
		
		}
		
		
		
	}


