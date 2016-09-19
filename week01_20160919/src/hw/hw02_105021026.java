package hw;
import java.util.Scanner;
import java.util.Random;
public class hw02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入n:");
		Scanner scn =new Scanner(System.in);
		Random rnd =new Random();
		int a =scn.nextInt();
		int b =rnd.nextInt(a+1);
		int c =rnd.nextInt(a+1);
		int d =rnd.nextInt(a+1);
		int e =rnd.nextInt(a+1);
		int f =rnd.nextInt(a+1);
		int g =rnd.nextInt(a+1);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}
