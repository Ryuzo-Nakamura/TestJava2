package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		// 練習問題１
		System.out.println("====練習問題１====");
		
		final double TAX = 1.1;
		System.out.println(TAX);
		
		
		// 練習問題２
		System.out.println("\n====練習問題２====");
		
		int x = 480;
		double price = x * TAX;
		System.out.println(price);
		
		
		// 練習問題３
		System.out.println("\n====練習問題３====");
		
		String name = "中村竜蔵";
		System.out.println(name);
		
		
		// 練習問題４
		System.out.println("\n====練習問題４====");
		
		String str1 = "この商品の値段は";
		String str2 = "円です";
		System.out.println(str1 + price + str2);
	}
}
