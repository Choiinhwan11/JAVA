package nested;

public class Outer {
	private String name;
	
	public void output() {
		System.out.println("이름 = " + this.name + "\t나이" + new Inner().age);
		//단 객체를 생성하면 접근할 수 있습니다. 
	}
	
	class Inner{
		private int age;
		//inner class 는 Outer에 접근 가능
		//but inner class 에 접근 불가능 private 이기 때문에
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age);
			//name 은 상속받지 않았기 떄문에 super.아니다.
			//Inner 것도 아니기 때문에 this. 도 에러이다.
			// Outer.this.~~
			//파일명은 Outer$Ineer.class가 된다. 그냥 Inner.class 는 독립된 class 로 보이기 떄문
		}
		
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "홍길동";
		Outer.Inner inner = outer.new Inner();
		//중첩은 안에다가 생성해야한다.
		inner.age = 25;
		inner.disp();
//		inner.name = "코난"; //-error 접근 x
		Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		//Outer class 안이므로 Outer를 생략할 수 있다.
		Inner inner3 = new Outer().new Inner();
		inner3.age = 35;
		inner3.disp();
		//inner3만을 생성하기 위해 만들어진 outer.

	}
	
}//class Outer
