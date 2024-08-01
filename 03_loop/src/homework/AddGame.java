package homework;

import java.io.IOException;
import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int result, user, count, yn;
		String re;
		while(true) {
			count = 0;
			for(int i = 1 ; i <= 5 ; i++) {
				num1 = (int)(10 + 90 * Math.random());
				num2 = (int)(10 + 90 * Math.random());
				result = num1 + num2;
				for(int j = 1 ; j <= 2 ; j++) {
					System.out.println("[" + i + "] " + num1 + " + " + num2 + " = ");
					user = sc.nextInt();
					if(user == result) {
						System.out.println("딩동뎅");
						count++;
						break;
					}else System.out.println("틀렸다");
				}
				System.out.println("정답은 " + result);
			}
			System.out.println("당신은 총 " + count 
					+ " 문제를 맞추어서 점수는 " + count * 20 + "점 입니다.");
			do {
				System.out.print("또 할래(Y/N)");
//				yn = System.in.read();
				yn = sc.nextInt();
			}while(yn != 'n' && yn != 'N' && yn != 'y' && yn != 'Y');
			if(yn == 'n' || yn == 'N') { 
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
//			do {
//				System.out.print("또 할래(Y/N)");
//				yn = System.in.read();
//			}while(!re.equals("n") &&!re.equals("N") &&!re.equals("y") &&!re.equals("Y"));
//			if(re.equals("n") &&re.equals("N")) break;
		}
	}
}