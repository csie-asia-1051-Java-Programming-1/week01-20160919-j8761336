package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021026 詹佩郡
 */

import java.util.Scanner;

public class ex01_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入華氏溫度:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.print("攝氏溫度=" + ((a - 32) * 5 / 9));

	}

}
