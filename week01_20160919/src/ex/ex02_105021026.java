package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021026 詹佩郡
 */

import java.util.Scanner;

public class ex02_105021026 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入你的體重(公斤):");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.print("你的體重是" + (a / 0.45359) + "磅");
	}

}
