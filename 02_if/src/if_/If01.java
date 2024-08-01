package if_;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		if(a >= 50) System.out.println(a + "는 50보다 크거나 같다.");
//		System.out.println(a + "는 50보다 작다.");
//		System.out.println();
		//b c
		if(true)
		  if(false)System.out.println("A");
		  else System.out.println("B");
		System.out.println("C");
		System.out.println();
		//a c
		if(true)
		  if(true)System.out.println("A");
		  else System.out.println("B");
		System.out.println("C");
		System.out.println();
		//c
		if(false)
			  if(false)System.out.println("A");
			  else System.out.println("B");
			System.out.println("C");
			System.out.println(); // else 는 가장 위에 있는 if의 false를 대변한다.
	}
}
