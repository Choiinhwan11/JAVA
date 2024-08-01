package inheritance;

public class SubMain extends Super{
	protected String name;
	protected int age;
	
	public SubMain() {
		System.out.println("SubMain의 기본생성자입니다.");
	}
	public SubMain(String name, int age, double weight, double height) {
		super(weight, height);
		System.out.println("SubMain의 생성자입니다.");
		this.name = name;
		this.age = age;
//		this.weight = weight;
//		this.height = height;
//		super.weight = weight; // 부모의 참조값을 갖는다.
//		super.height = height;
	}
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		//System.out.println("몸무게 = " + weight);
		//System.out.println("키 = " + height);
		disp();
	}

	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25 , 70.3 , 176.5);
		aa.output();
		System.out.println("---------");
		aa.disp();
		System.out.println();
//		Super bb = new subMain("코난", 13, 45.8, 153.6);
//		bb.output();// super을 참조하기 떄문에 불러낼 수 없다.

	}

}
