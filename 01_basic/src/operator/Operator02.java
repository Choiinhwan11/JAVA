package operator;

import java.util.Scanner;

public class Operator02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int grade = sc.nextInt();
//		grade >= 80 && grade <= 100 ? "합격" : "불합격" 뒤처리가 없다.
		System.out.println(grade >= 80 && grade <= 100 ? "합격" : "불합격");
		String result = grade >= 80 && grade <= 100 ? "합격" : "불합격";
		System.out.println(result);
	}

}
