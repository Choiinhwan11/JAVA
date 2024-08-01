package variable;

public class Variable02 {
	int a ; // 필드, 초기값
	static int b;
	static double c;
	static String str;

	public static void main(String[] args) {
		
		int a = 100; // local variable 지역변수 , garbage 값 쓰레기값
		System.out.println("지역변수 a = " + a); // 먼저 함수부터 찾는다.
		System.out.println("필드 a = " + new Variable02().a); 
		System.out.println("필드 b = " + Variable02.b);
		System.out.println("필드 c = " + c);
		System.out.println("필드 str = " + str);

	}

}
