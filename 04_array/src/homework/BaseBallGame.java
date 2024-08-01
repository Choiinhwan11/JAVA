package homework;

import java.io.IOException;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int com[] = new int[3];
		int[] user = new int[3];
		String yn;
		int strike, ball;
		do {
			System.out.println("게임을 실행하시겠습니까?(Y/N)");
			yn = sc.next();
		}while(!yn.equals("Y") && !yn.equals("y") &&!yn.equals("N") &&!yn.equals("n"));
		if(yn.equals("Y") || yn.equals("y")) {
			System.out.println("게임을 시작합니다.");
			for(int i = 0 ; i < com.length; i++) {
				com[i] = (int) (Math.random()*9 + 1);
				for(int j = 0 ; j < i ; j ++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			while(true) {
				System.out.println("숫자 입력 : ");
				for(int i = 0 ; i <user.length ; i++) {
					user[i] = System.in.read() - '0';
				}
				System.in.read();
				System.in.read();
				strike = ball = 0;
				for(int i = 0 ; i < com.length ; i++) {
					for(int j = 0 ; j < user.length ; j++) {
						if(com[i] == user[j]) {
							if(i == j) {
								strike++;
							}else {
								ball++;
							}
						}
					}
				}
				System.out.println(strike + " strike " + ball + " ball");
				if(strike == 3) {
					break;
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}