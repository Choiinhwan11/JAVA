package for_;

import java.util.Scanner;

public class For06 {
	public static void main(String[] args) {
		int n, mul;
		String re;
		Scanner sc = new Scanner(System.in);
		while(true) {
			mul = 1;
			System.out.println("1부터 10까지의 숫자 입력 해주세요 : ");
			n = sc.nextInt();
			if(n == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(n < 0) {
				continue;
			}
			for(int i = 1 ; i <= n ; i++) {
				mul *= i;
			}
			System.out.println(n + "! = " + mul);
		}
	}
}
