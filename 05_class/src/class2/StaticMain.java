package class2;
class StaticTest{
	private int a; // 필드, 인스턴스 변수,  heap 영역에 잡힌다.
	private static int b; // 필드, 클래스 변수, static 영역에 잡힌다.
	static {
		System.out.println("static 의 초기화 영역입니다.");
		b = 7;
	}
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a = 7;
	}
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a = " + a + "\t b = " + StaticTest.b);
//this.이 a 앞에 생략되어있다. b는 StaticTest.이 생략되어있다.
	}
	public static void output() {
		//System.out.println("a = " + a + "\t b = " + StaticTest.b);
		//static method 안에는 static 밖에 존재하지 않는다. this 는 heap영역 안에 있는 객체 안의 인스턴스 변수에만 존재한다.
		System.out.println("Static output");
		
	}
}

//-------
public class StaticMain {
	public static void main(String[] args) {
		StaticTest aa = new StaticTest(); // stack 영역에 잡힌다.
		aa.calc();
		aa.disp();
		StaticTest bb = new StaticTest(); // stack 영역에 잡힌다.
		bb.calc();
		bb.disp();
		StaticTest cc = new StaticTest(); // stack 영역에 잡힌다.
		cc.calc();
		cc.disp();
		System.out.println();
		StaticTest.output();
		aa.output();
		
		
	}
}
