package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		System.out.println("현급입력 : " + tot);
		int num = tot / 1000;
		System.out.println("천원 : " + num + "장");
		tot %= 1000;
		//
		num = tot / 100;
		System.out.println("백원 : " + num + "개");
		tot %= 100;
		//
		num = tot / 10;
		System.out.println("십원 : " + num + "개");
		tot %= 10;
		//
		num = tot;
		System.out.println("일원 : " + num + "개");

	}

}
