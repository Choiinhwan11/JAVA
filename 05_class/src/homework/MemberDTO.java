package homework;

import java.util.Scanner;

public class MemberDTO {
	private String name, address, phone;
	private int age;
	public MemberDTO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		this.name = sc.next();
		System.out.println("주소를 입력하세요 : ");
		this.address = sc.next();
		System.out.println("핸드폰 번호를 입력하세요 : ");
		this.phone = sc.next();
		System.out.println("나이를 입력하세요 : ");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "\t" + age+ "\t" + phone + "\t" + address;
	}

}
