package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		String b = "apple";
		String c = new String("apple");
		
		System.out.println("b == c :" + (b == c ? "같다" : "다르다")); // 주소비교
		System.out.println("b != c :" + (b != c ? "참" : "거짓")); // 주소비교
		
		
		System.out.println("b.equals(c) :" + (b.equals(c) ? "같다" : "다르다")); // 주소비교
		System.out.println("!b.equals(c) :" + (!b.equals(c) ?  "참" : "거짓")); // 주소비교
	}

}
