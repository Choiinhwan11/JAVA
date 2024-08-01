package inheritance;

public class ChildMain extends Super{
	protected String name;
	protected int age;
	public ChildMain() {
		System.out.println("ChildMain의 기본생성자입니다.");
	}
	public ChildMain(String name, int age, double weight, double height) {
		super(weight, height);
		System.out.println("ChildMain의 생성자입니다.");
		this.name = name;
		this.age = age;
	}
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25 , 70.3 , 176.5);
		aa.disp(); // 내가 우선권이 되기 떄문에 같은 이름의 메소드여도 자식 메소드 부터 실행된다.
		Super bb = new ChildMain("코난", 13, 45.8, 153.6);
		bb.disp();
	}
}
/*
 * Overload                    Override
 * 하나의 클래스                    부모/ 자식 클래스
 * 메소드명이 같아야 한다.             메소드명 매개변수 return 형이 모두 같아야한다.
 * 인수의 개수 / 인수의 형            Modifier(접근제어자)는 달라도 된다.(자식 클래스의 Modifier이 더 커야한다.)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
