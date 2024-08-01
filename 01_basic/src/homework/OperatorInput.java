package homework;

import java.io.IOException;
import java.util.Scanner;

public class OperatorInput {

	public static void main(String[] args) throws IOException {
		System.out.println("한 문자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		char ch = (char)System.in.read();
		int result = 'a' <= ch && ch <= 'z' ? (ch - 32) :(ch + 32);
		System.out.println("변경되었습니다 : " +  (char) result);
		sc.close();
	}

}
