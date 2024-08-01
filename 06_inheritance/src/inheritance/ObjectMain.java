package inheritance;

class Test extends Object{
	@Override
	public String toString() {
		return getClass() + "@개바부";
	}
	
}


//-----------------------
public class ObjectMain extends Object{

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객채 t = " + t); 
		System.out.println("객체 t = " + t.toString());
		System.out.println("객채 t = " + t.hashCode()); 
		System.out.println();
		
		String str = "apple";
		// object class 에서는 toString() 은 주소를 16진수로 반환 hashcode()에서는 10진수로 주소반환
		// String class 에서는 toString() 는 문자열로 반환.
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode()); // 믿으면 안됨,  표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현은 다할 수 없다.
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); // false 참조값 비교
		System.out.println("aa.equals(bb) : " + (aa.equals(bb))); // true 문자열 비교
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==bb : " + (cc==dd)); // false 참조값 비교
		System.out.println("cc.equals(dd) : " + (cc.equals(dd))); // false 참조값 비교
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); // false 참조값 비교
		System.out.println("ee.equals(ff) : " + (ee.equals(ff))); // true 문자열 비교

	}

}
/*

class Object {
	public boolean equals(Object obj){} //참조값 비교
	public String toSting(){} //클@16진수
	public int hashCode(){} //10진수

}

class String extends Object{
	public boolean equals(Object obj){}//문자열 비교
	public String toString(){} // 문자열
	public int hashCode(){}  

}



*/