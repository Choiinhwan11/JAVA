package variable;

import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException{
		System.out.print("정수  입력 : ");
		int a = System.in.read() - 48; // 1개의 문자만 받을 수 있다. 숫자를 입력해도 문자로 입력받는다.
		// 1을 입력하면 49가 입력된다.
		System.in.read();
		System.in.read();
		System.out.print("정수  입력 : ");
		int b = System.in.read() - 48;
		System.out.println(a + " + " + b + " = " + (a + b));
		
		
		
		
		
	}
}
