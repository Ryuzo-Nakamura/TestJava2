package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		// 練習問題１
		System.out.println("\n====練習問題１====");
		
		Random random = new Random();
		int fortune = random.nextInt(4);
		String message;
		System.out.println(fortune);
		switch(fortune) {
		case 1:
			message = "吉です";
			break;
		case 2:
			message = "中吉です";
			break;
		case 3:
			message = "大吉です";
			break;
		default:
			message = "凶です";
		}
		System.out.println(message);
		
		
		// 練習問題２
		System.out.println("\n====練習問題２====");
		
		String multpleOf7 = new String();
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				if(multpleOf7.length() != 0) {
					multpleOf7 += ",";
				}
				multpleOf7 += i;
			}
		}
		System.out.println(multpleOf7);
		
		
		// 練習問題３
		System.out.println("\n====練習問題３====");
		
		String row;
		int mult;
		for(int i = 1; i <= 9; i++) {
			row = "";
			for(int j = 1; j <= 9; j++) {
				if(j != 1) {
					row += " ";
				}
				mult = i * j;
				if(Integer.toString(mult).length() == 1) {
					row += " ";
				}
				row += mult;
				if(j == 9) {
					System.out.println(row);
				}
			}
		}
	}
}
