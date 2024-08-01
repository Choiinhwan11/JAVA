package constructor;

class Hello{
	private String name;
	private int age;
	//생성자는 return을 안하기 때문에 void 도 쓰면 안된다.
	public  Hello(){
		System.out.println("기본 생성자");
	}
	public Hello(String name) {
		this();// Hello()를 호출한다.
		System.out.println("이름을 처리하는 생성자");
		this.name = name;
	}
	public Hello(int age) {
		this("코난");// Hello(String name)을 호출한다.
		System.out.println("나이를 처리하는 생성자,");
		this.age = age;
		//Overload 된 다른 생성자를 호출
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//this() : Overload 된 다른 생성자를 생성할때.
	
}


//----
public class Constructor01 {

	public static void main(String[] args) {
		
		Hello aa = new Hello();
		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();
		
		Hello bb = new Hello("홍길동");
		System.out.println(bb.getName() + "\t" + bb.getAge());
		System.out.println();
		
		Hello cc = new Hello(25);
		System.out.println(cc.getName() + "\t" + cc.getAge());
		System.out.println();
		
		
		
		
		

	}

}
