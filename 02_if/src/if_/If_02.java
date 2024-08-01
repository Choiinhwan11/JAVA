package if_;

import java.util.Scanner;

public class If_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println("c의 값 : ");
		int c = sc.nextInt();
		int avg = (a + b + c) / 3;
		
		if(a < 40 || b < 40 || c < 40)
			System.out.println("과락으로 불합격");
		else if(avg >= 60 )System.out.println("합격");
			else System.out.println("불합격");
			
		
	}
}