package array;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] ar = new boolean[5];
		while(true) {
			System.out.println("**************");
			System.out.println("1. 입차");
			System.out.println("2. 출차");
			System.out.println("3. 리스트");
			System.out.println("4. 종료");
			System.out.println("**************");
			System.out.print("메뉴 : ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print("위치 입력 : ");
				int ent = sc.nextInt();
				if(ar[ent - 1]) {
					System.out.println(ent + "위치 이미 주차되어있습니다");
				}else {
					ar[ent - 1] = true;
					System.out.println(ent + "위치에 입차");
				}
			}else if(num == 2) {
				System.out.print("위치 입력 : ");
				int exit = sc.nextInt();
				if(!ar[exit - 1]) {
					System.out.println(exit + "위치에 주차되어있지 읺습니다");
				}else {
					ar[exit - 1] = false;
					System.out.println(exit + "위치에 출차");
				}
			}else if(num == 3){
				for(int i = 0 ; i < 5 ; i++) {
					System.out.println(i + 1 + "위치 : " + ar[i]);
				}
			}else {
				System.out.println("프로그램을 종료합니다");
			}
			
		}

	}

}
