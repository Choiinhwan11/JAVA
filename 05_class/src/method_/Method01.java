package method_;

public class Method01 {

	public static void main(String[] args) {
		Method01 m = new Method01(); // heap 영역의 이름을 부를 수는 없다.
		System.out.println("객체 m = " + m); // package명.class 명 @ 주소값(참조값)
		System.out.println("객체 m = " + m.toString()); 
		// 호출
		m.display();
		Method01.output();
		m.output();
		output();

	}
	public void display() {
		System.out.println("method...");
	}
	public static void output() {
		System.out.println("static method...");
	}

}
