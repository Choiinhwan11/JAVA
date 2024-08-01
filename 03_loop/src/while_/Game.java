package while_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int count = 0, num;
//		int answer = (int)(1 + 100 * Math.random());
//		System.out.println("숫자를 맞춰주세요");
//		while(true) {
//			count++;
//			System.out.println("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num == answer) {
//				System.out.println("딩동댕..." + count + "번만에 맞추셨습니다.");
//				break;
//			}else if(num < answer){
//				System.out.println(num + "보다 큰 숫자 입니다.");
//			}else {
//				System.out.println(num + "보다 작은 숫자 입니다.");
//			}
//		}
		Scanner scan = new Scanner(System.in);
		int com, user, count;
		while(true) {
			count = 0;
			com = (int)(1 + 100 * Math.random());
			System.out.println("1 ~100 까지의 숫자를 맞춰주세요");
			System.out.println("숫자 입력하세요.");
			while(true) {
				count++;
				user = scan.nextInt();
				if(com == user) {
					System.out.println("딩동댕"+ count + "번만에 맞추셨습니다.");
					break;
				}
				else if(com > user) System.out.println(user + "보다 큰 숫자입니다.");
				else System.out.println(user + "보다 작은 수 입니다.");
			}
			System.out.println("한 번 더?(n/y) :");
			String re = scan.next();
			if(re.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
