package switch_;

import java.io.IOException;
import java.util.Scanner;

public class switch02 {

	public static void main(String[] args) throws IOException {
		int a, b, op;
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값 : ");
		a = sc.nextInt();
		System.out.println("b의 값 : ");
		b = sc.nextInt();
		System.out.println("연산자(+,-,*,/)를 입력 : ");
		op = System.in.read();
//		if(op == '+') {
//			System.out.println(a + " + " + b + " = " + (a + b));
//		}else if(op == '-') {
//			System.out.println(a + " - " + b + " = " + (a - b));
//		}else if(op == '*') {
//			System.out.println(a + " * " + b + " = " + (a * b));
//		}else if(op == '/') {
//			System.out.println(a + " / " + b + " = " + ((double)a / b));
//		}else System.out.println("연산자 error");
		switch(op) {
		case '+' : System.out.println(a + " + " + b + " = " + (a + b));break;
		case '-' : System.out.println(a + " - " + b + " = " + (a - b));break;
		case '*' : System.out.println(a + " * " + b + " = " + (a * b));break;
		case '/' : System.out.println(a + " / " + b + " = " + ((double)a / b));break;
		default : System.out.println("연산자 error");
		}
		
		

	}

}
