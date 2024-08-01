package sungJuck;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJuckService {
	private ArrayList<SungJuckDTO> list = new ArrayList<SungJuckDTO>();
	// list는 주소값이 매개변수로 들어가기 때문에 다른 클래스에서 주소값에다가 값을 추가하고 변경해도 변경된다.
	private SungJuck sungJuck;
	private Scanner sc = new Scanner(System.in);
	public void menu() {
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("6. 끝");
			System.out.println("메뉴번호를 입력하세요 : ");
			int num = sc.nextInt();
			switch(num){
			case 1 : sungJuck = new SungJuckInsert(); break;
			case 2 : sungJuck = new SungJuckPrint(); break;
			case 3 : sungJuck = new SungJuckUpdate(); break;
			case 4 : sungJuck = new SungJuckDelete(); break;
			case 5 : sungJuck = new SungJuckSort(); break;
			case 6 : System.out.println("시스템을 종료합니다."); return;
			default : System.out.println("1~6중에 선택하세요");
			}
			if(num == 1 || num == 2 || num == 3 || num == 4 ||num == 5) {
				sungJuck.excute(list);
			}
		}
	}
	
}
