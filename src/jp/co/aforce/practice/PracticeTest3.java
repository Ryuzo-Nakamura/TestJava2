package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
		// 練習問題１
		
		String[] items = {"シャープペンシル", "ボールペン", "リングノート" ,"クリップ", "消しゴム"};
		
		
		// 練習問題２
		System.out.println("====練習問題２====");
		
		System.out.println(items[1]);
		
		
		// 練習問題３
		
		ArrayList<String> members = new ArrayList<>();
		members.add("山田太郎");
		members.add("鈴木花子");
		members.add("佐藤二郎");
		members.add("山田太郎");
		members.add("高橋三郎");
		
		
		// 練習問題５
		System.out.println("\n====練習問題５====");
		
		System.out.println(members.get(2));
	}
}
