package homework;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		int ranN;
		boolean check;
		
		System.out.print("현금 입력 :");
		int cash = sc.nextInt();
		for(int k = 1 ; k <= cash / 1000 ;k ++) {
			for(int i = 0 ; i < 6 ; i++) {
				while(true) {
					ranN = (int) (Math.random()*45 + 1);
					check = false;
					for(int j = 0 ; j < i ; j++) {
						if(lotto[i] == ranN) {
							check = true;
							break;
						}
					}
					if(!check) {
						lotto[i] = ranN;
						break;
					}
				}
			}
			for(int i = 0 ; i < 4 ; i ++) {
				for(int j = i + 1 ; j < 5 ; j++) {
					if(lotto[i] > lotto[j]) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			}
			for(int i : lotto) {
				System.out.print(String.format("%-2d", i) + " ");
			}
			System.out.println();
			if(k % 5 == 0) {
				System.out.println();
			}
		}
	}
}
/*
 * [문제] 문제 로또 프로그램
 * 
 * 1~45사이의 난수를 6개 발생합니다.
 * 단, 숫자는 중복이 되어서는 안된다.
 * 현금 입력 : 
 * 1줄당 금액이 1천원 입니다.
 * 
 * */
