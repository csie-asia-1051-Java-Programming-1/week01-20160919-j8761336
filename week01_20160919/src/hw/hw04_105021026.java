package hw;
import java.util.Scanner;
public class hw04_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入a & b:");
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		double c =Math.pow(a,1.0/b);
		System.out.print("a開b次方為"+ c);
	}

}
