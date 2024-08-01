package homework;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bet, coin = 1000, comp, user, yn;
		String result = null;
		while(true) {
			while(coin > 0) {
				System.out.print("가위(1), 바위(2), 보자기(3) 입력 :");
				user = sc.nextInt();
				while(true) {
					System.out.println("배팅 금액 : ");
					bet = sc.nextInt();
					if(bet > coin) {
						System.out.println("베팅 급액이 현재 급액보다 많습니다. 다시 입력해주세요.");
					}else{
						System.out.println("베팅 급액이 충전되었습니다.");
						break;
					}
				}
				System.out.println("결과를 보시려면 Enter를 치세요");
				sc.nextLine();
				sc.nextLine();
				comp = (int)Math.random() * 3 + 1;
				if(user == comp) {
					result = "비겼다.";
				}
				else if(user == 2) {
					if(comp == 3) {
						result = "ㅠㅠ..졌다";
						coin -= bet;
					}else if(comp == 1) {
						result = "야~호 이겼다.";
						coin += bet;
					}
				}
				else if(user == 1) {
					if(comp == 2) {
						result = "ㅠㅠ..졌다";
						coin -= bet;
					}else if(comp == 3) {
						result = "야~호 이겼다.";
						coin += bet;
					}
				}else if(user == 3) {
					if(comp == 1) {
						result = "ㅠㅠ..졌다";
						coin -= bet;
					}else if(comp == 2) {
						result = "야~호 이겼다.";
						coin += bet;
					}
				}
				System.out.print("컴퓨터는 ");
				switch(comp) {
				case 1: System.out.print("가위"); break;
				case 2: System.out.print("바위");break;
				case 3: System.out.print("보");break;
				}
				System.out.print(", 나는 ");
				switch(user) {
				case 1: System.out.print("가위");break;
				case 2: System.out.print("바위");break;
				case 3: System.out.print("보");break;
				}
				System.out.println();
				System.out.println(result);
				System.out.println("현재 금액은 " + coin);
			}
			System.out.println("또 할래 (y/n) : ");
			yn = sc.nextInt();
			if(yn == 'n'){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("insert coin :");
				coin = sc.nextInt();
			}
		}
		
	}
}
