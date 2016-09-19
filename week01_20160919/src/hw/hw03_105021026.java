package hw;

import java.util.Scanner;

public class hw03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入6數字:");
		Scanner scn = new Scanner(System.in);
		int a =Math.round(scn.nextFloat());
		int b =Math.round(scn.nextFloat());
		int c =Math.min(a,b);
		a =Math.round(scn.nextFloat());
		c =Math.min(c,a);
		a =Math.round(scn.nextFloat());
		c =Math.min(c,a);
		a =Math.round(scn.nextFloat());
		c =Math.min(c,a);
		a =Math.round(scn.nextFloat());
		c =Math.min(c,a);
		System.out.print("最小值為:"+ c );
	}

}
