package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String[] args) {
		// 練習問題２
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		
		// 練習問題３
		System.out.println("\n====練習問題３====");
		
		String dog = "犬";
		if(animals.contains(dog)) {
			System.out.println(dog + "はリストに含まれています");
		}else {
			System.out.println(dog + "はリストに含まれていません");
		}
		
		
		// 練習問題４
		System.out.println("\n====練習問題４====");
		
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1; // 月の値を 0～11 から 1～12 に変更 
		String message;
		switch(month) {
		case 1:
			message = "冬物セール";
			break;
		case 2, 3, 4:
			message = "春物を売る";
			break;
		case 5:
			message = "春物セール";
			break;
		case 6, 7:
			message = "夏物を売る";
			break;
		case 8:
			message = "夏物セール";
			break;
		case 9:
			message = "秋物を売る";
			break;
		case 10, 11, 12:
			message = "冬物を売る";
			break;
		default :
			message = "不正な月です";
			break;
		}
		System.out.println(message);
	}
}
