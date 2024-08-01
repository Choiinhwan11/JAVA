package collection;

public class GenericMain<T> {///지금 당장 정하지는 않는다.
	//T = type
	//E = element
	//K = key
	//V = value
	private T a;
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public static void main(String[] args) {
		GenericMain<String> aa = new GenericMain<String>();
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
//		aa.setA(25);error
		GenericMain<Integer> bb = new GenericMain<Integer>();
		//기본형으로 설정하면 안된다 class 형으로 설정
		bb.setA(25);
		System.out.println("나이 = " + bb.getA());
		

	}

}
