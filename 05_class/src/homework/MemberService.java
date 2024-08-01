package homework;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
	private String name, address, phone;
	private int age;
	private  Scanner sc = new Scanner(System.in);
	public void memu() {
		while(true) {
			System.out.println("1. 가입");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 탈퇴");
			System.out.println("5. 끝내기");
			System.out.println("번호 입력: ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : insert();break;
			case 2 : list();break;
			case 3 : update(); break;
			case 4 : delete(); break;
			case 5 : return;
			default : break;
			}
		}
	}
	public void insert() {
		int i ;
		for(i = 0 ; i <ar.length ; i++) {
			if(ar[i] == null) {
				break;
			}
		}
		
		if(i == 5) {
			System.out.println("정원이 꽉찼습니다");
		}else {
			ar[i] = new MemberDTO();
			System.out.println("1 row created");
		}
	}
	public void list() {
		for(int i = 0 ; i < ar.length ; i++) {
			if(ar[i] != null) {
				System.out.println("이름 : " + ar[i].getName());
				System.out.print("주소 :" + ar[i].getAddress());
				System.out.print("번호 : " + ar[i].getPhone());
				System.out.println("나이 : " +ar[i].getAge());
			}
	   	}
	}
	public void update() {
		System.out.println("핸드폰 번호를 입력 : ");
		String phone = sc.next();
		int i;
		for(i = 0 ; i < ar.length ; i++) {
			if(ar[i] != null && ar[i].getPhone().equals(phone)) {
				System.out.println("이름 : " + ar[i].getName());
				System.out.print("주소 :" + ar[i].getAddress());
				System.out.print("번호 : " + ar[i].getPhone());
				System.out.println("나이 : " +ar[i].getAge());
				System.out.println("이름을 입력하세요 : ");
				ar[i].setName(sc.next());
				System.out.println("주소를 입력하세요 : ");
				ar[i].setAddress(sc.next());
				System.out.println("핸드폰 번호를 입력하세요 : ");
				ar[i].setPhone(sc.next());
				System.out.println("나이를 입력하세요 : ");
				ar[i].setAge(sc.nextInt());
				break;
			}
		}
		if(i == 5) {
			System.out.println("입력하신 핸드폰 번호는 없습니다.");
		}
	}
	public void delete() {
		System.out.println("핸드폰 번호를 입력 : ");
		String phone = sc.next();
		int i;
		for(i = 0 ; i < ar.length ; i++) {
			if(ar[i] != null && ar[i].getPhone().equals(phone)) {
				ar[i] = null;
				break;
			}
		}
		if(i == 5) {
			System.out.println("입력하신 핸드폰 번호는 없습니다.");
		}
	}

}
