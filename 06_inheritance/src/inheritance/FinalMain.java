package inheritance;

enum Color{
	RED, GREEN, BLUE//0번부터 세팅이 알아서 된다.
}

//-----------------
class Final{
	public final  String FRUIT = "사과";
	public final  String FRUIT2;
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2;// static전용에서 초기화해주어야 한다. 생성자는 heap영역
//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;
	
	static {
		ANIMAL2 = "기린";
	}
	public Final() {
		FRUIT2 = "딸기";
	}
	
}


///----------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		System.out.println("AGE = " + AGE);
		final String NAME;
		NAME = "홍길동"; // 한번의 기회를 더 준다. 
		System.out.println("NAME = " + NAME);
		System.out.println();
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT = " + f.FRUIT2); // final을 지정하지 않는 경우에는 생성자에서 지정하면 된다.
		System.out.println();
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL = " + Final.ANIMAL2);
		System.out.println();
		System.out.println("빨강 = " + Color.RED);
		System.out.println("빨강 = " + Color.RED.ordinal());
		System.out.println("빨강 = " + Color.GREEN);
		System.out.println("빨강 = " + Color.BLUE);
		for(Color data : Color.values()) {
			System.out.println(data.ordinal() + " "+ data);
		}
		
		
		
		
		

	}

}
