package class2;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	public StringBufferMain() {
		Scanner sc = new Scanner (System.in);
		System.out.println("원하는 단을 입력 : ");
		dan = sc.nextInt();
	}
	public void display() {
//		String str = "------------------";
//		for(int i = 1 ; i <= 9 ; i++) {
//			str += dan + " * " + i + " = " + (dan * i) + "\n";
//		}
//		System.out.println(str);
		StringBuffer sb = new StringBuffer();
		for(int i = 1 ; i <= 9 ; i++) {
			sb.append(dan + " * " + i + " = " + (dan * i) + "\n");
		}
//		System.out.println(sb);
//		sb.delete(0,  sb.length());
//		System.out.println(sb.toString());
		
	}
	public static void main(String[] args) {
		StringBufferMain sbf = new StringBufferMain();
		sbf.display();
	}
}

/*
 * 원하는 단을 입력 : 2
 * 2 * 1 = 2
2 * 2 = 4
2 * 3 = 6

2 * 9 = 18
 */

