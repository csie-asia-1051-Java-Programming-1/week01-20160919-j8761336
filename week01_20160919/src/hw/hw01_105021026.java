package hw;

import java.util.Scanner;

public class hw01_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入n:");
		Scanner scn =new Scanner(System.in);
		double a =scn.nextDouble();
		double b =Math.ceil(Math.log(a)/Math.log(2));
		System.out.print("共需要"+ b +"位元!");
	}

}
